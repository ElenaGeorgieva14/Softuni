import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
     static class Hero{
         String name;
         int HP;
         int MP;
         Hero(String name,int HP, int MP){
             this.name=name;
             this.HP=HP;
             this.MP=MP;
         }

         String getName(){
             return this.name;
         }

         void setName(String name){
             this.name=name;
         }

         int getHP(){
             return this.HP;
         }

         void setHP(int HP){
             this.HP=HP;
         }

         int getMP(){
             return this.MP;
         }

         void setMP(int MP){
             this.MP=MP;
         }
     }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int heroesNum=Integer.parseInt(scanner.nextLine());

        List<Hero> heroes=new ArrayList<>();

        for (int i = 0; i < heroesNum; i++) {
            String[] data=scanner.nextLine().split(" ");
            String name=data[0];
            int HP=Integer.parseInt(data[1]);
            int MP=Integer.parseInt(data[2]);
            Hero hero=new Hero(name,HP,MP);
            heroes.add(hero);
        }

        String input=scanner.nextLine();

        while(!input.equals("End")){
            String[] data=input.split(" - ");
            String command=data[0];

            switch (command){
                case "CastSpell":
                    String name=data[1];
                    int MPNeeded=Integer.parseInt(data[2]);
                    String spellName=data[3];
                    castSpell(name,MPNeeded,spellName,heroes);
                    break;
                case "TakeDamage":
                    name=data[1];
                    int damage=Integer.parseInt(data[2]);
                    String attacker=data[3];
                    takeDamage(heroes,name,damage,attacker);
                    break;
                case "Recharge":
                    name=data[1];
                    int amount=Integer.parseInt(data[2]);
                    recharge(heroes,name,amount);
                    break;
                case "Heal":
                    name=data[1];
                    amount=Integer.parseInt(data[2]);
                    heal(heroes,name,amount);
                    break;
            }

            input=scanner.nextLine();
        }
        for (int i = 0; i < heroes.size(); i++) {
            System.out.printf("%s%n HP: %d%n MP: %d%n",heroes.get(i).getName(),heroes.get(i).getHP(),heroes.get(i).getMP());
        }

    }

    private static void heal(List<Hero> heroes, String name, int amount) {
        int index=0;
        for (int i = 0; i < heroes.size(); i++) {
            if(heroes.get(i).getName().equals(name)){
                index=i;
            }
        }

        if(heroes.get(index).getHP()+amount>100){
            amount=100-heroes.get(index).getHP();
        }

        heroes.get(index).setHP(heroes.get(index).getHP()+amount);
        System.out.printf("%s healed for %d HP!%n",name,amount);
     }

    private static void recharge(List<Hero> heroes, String name, int amount) {
        int index=0;
        for (int i = 0; i < heroes.size(); i++) {
            if(heroes.get(i).getName().equals(name)){
                index=i;
            }
        }

        if(heroes.get(index).getMP()+amount>200){
            amount=200-heroes.get(index).getMP();
        }

        heroes.get(index).setMP(heroes.get(index).getMP()+amount);
        System.out.printf("%s recharged for %d MP!%n",name,amount);
     }

    private static void takeDamage(List<Hero> heroes, String name, int damage, String attacker) {
        int index=0;
        for (int i = 0; i < heroes.size(); i++) {
            if(heroes.get(i).getName().equals(name)){
                index=i;
            }
        }
         heroes.get(index).setHP(heroes.get(index).getHP()-damage);

        if(heroes.get(index).getHP()>0){
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,damage,attacker,heroes.get(index).getHP());
        }else{
            heroes.remove(index);
            System.out.printf("%s has been killed by %s!%n",name,attacker);
        }
     }

    private static void castSpell(String name, int MPNeeded,String spellName,List<Hero>heroes){
        int index=0;
        for (int i = 0; i < heroes.size(); i++) {
            if(heroes.get(i).getName().equals(name)){
                index=i;
            }
        }
         if(heroes.get(index).getMP()>=MPNeeded){
             heroes.get(index).setMP(heroes.get(index).getMP()-MPNeeded);
             System.out.printf("%s has successfully cast %s and now has %d MP!%n",name,spellName,heroes.get(index).getMP());
         }else{
             System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
         }
    }
}
