package threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] firstLine=scanner.nextLine().split(" ");
        String firstName=firstLine[0];
        String lastName=firstLine[1];
        String address=firstLine[2];
        String town=firstLine[3];
        Threeuple<String,String,String> people=new Threeuple<>(firstName+" "+lastName,address,town);
        people.print();

        String[] secondLine=scanner.nextLine().split(" ");
        String name=secondLine[0];
        int beerLiters=Integer.parseInt(secondLine[1]);
        boolean isDrunk;
        if(secondLine[2].equals("drunk")){
            isDrunk=true;
        }else{
            isDrunk=false;
        }
        Threeuple<String,Integer,Boolean> drunkPeople=new Threeuple<>(name,beerLiters,isDrunk);
        drunkPeople.print();

        String[] thirdLine=scanner.nextLine().split(" ");
        name=thirdLine[0];
        double balance=Double.parseDouble(thirdLine[1]);
        String bankName=thirdLine[2];
        Threeuple<String,Double,String> bankInfo=new Threeuple<>(name,balance,bankName);
        bankInfo.print();
    }
}
