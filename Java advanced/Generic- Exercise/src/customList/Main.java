package customList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        CustomList<String> customList=new CustomList<>();
        while(!input.equals("END")){
            String[] data=input.split(" ");
            String command=data[0];

            switch (command){
                case "Add":
                    String element=data[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index=Integer.parseInt(data[1]);
                    String removedElement=customList.remove(index);

                    break;
                case "Contains":
                    element=data[1];
                    boolean containsElement=customList.contains(element);
                    System.out.println(containsElement);
                    break;
                case "Swap":
                    int index1=Integer.parseInt(data[1]);
                    int index2=Integer.parseInt(data[2]);
                    customList.swap(index1,index2);
                    break;
                case "Greater":
                    element=data[1];
                    int counter=customList.countGreaterThan(element);
                    System.out.println(counter);
                    break;
                case "Max":
                    String max=customList.getMax();
                    System.out.println(max);
                    break;
                case "Min":
                    String min=customList.getMin();
                    System.out.println(min);
                    break;
                case "Print":
                    customList.print();
                    break;

                case "Sort":
                    Sorter<String> sorter=new Sorter();
                    sorter.Sort(customList);
                    break;
            }

            input=scanner.nextLine();
        }


    }
}
