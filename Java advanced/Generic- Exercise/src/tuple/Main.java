package tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

         String [] data=scanner.nextLine().split(" ");
         String firstName=data[0];
         String lastName=data[1];
         String address=data[2];

         Tuple<String,String> person=new Tuple<>(firstName+" "+lastName,address);
        System.out.printf("%s -> %s%n",person.getItem1(),person.getItem2());

        String[] data1=scanner.nextLine().split(" ");
        String name=data1[0];
        int beerLiters=Integer.parseInt(data1[1]);

        Tuple<String,Integer> personBeer=new Tuple<>(name,beerLiters);
        System.out.printf("%s -> %d%n",personBeer.getItem1(),personBeer.getItem2());


        String[] data2=scanner.nextLine().split(" ");
        int number=Integer.parseInt(data2[0]);
        double decimalNumber=Double.parseDouble(data2[1]);

        Tuple<Integer,Double>integerDoubleTuple=new Tuple<>(number,decimalNumber);
        System.out.printf("%d -> %s%n",integerDoubleTuple.getItem1(),integerDoubleTuple.getItem2().toString());
    }
}
