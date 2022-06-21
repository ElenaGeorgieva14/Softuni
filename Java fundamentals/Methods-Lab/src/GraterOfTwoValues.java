import java.util.Scanner;

public class GraterOfTwoValues {
    public static int getMax(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static char getMax(char character1,char character2){
        if(character1>character2){
            return character1;
        }else{
            return character2;
        }
    }
    public static String getMax(String text1,String text2){
       if(text1.compareTo(text2)>=0){
           return text1;
       }else{
           return  text2;
       }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String type=scanner.nextLine();

        switch (type){
            case "int":
                 int num1=Integer.parseInt(scanner.nextLine());
                 int num2=Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                char character1=scanner.nextLine().charAt(0);
                char character2=scanner.nextLine().charAt(0);
                System.out.println(getMax(character1,character2));
                break;
            case "string":
                String text1= scanner.nextLine();
                String text2= scanner.nextLine();
                System.out.println(getMax(text1,text2));
                break;
        }
    }
}
