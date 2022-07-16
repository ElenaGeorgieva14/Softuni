package genericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> elements=new ArrayList<>();

        int elementsCount=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < elementsCount; i++) {
            String element=scanner.nextLine();
            elements.add(element);
        }

        String[] indexes=scanner.nextLine().split(" ");
        int index1=Integer.parseInt(indexes[0]);
        int index2= Integer.parseInt(indexes[1]);
        swapElements(elements,index1,index2);

       for(String element: elements){
           System.out.printf("%s: %s%n",element.getClass().getName(),element);
       }
    }

    public static <T> void swapElements(List<T>elements,int index1, int index2){
        T temp=elements.get(index1);
        elements.add(index1, elements.get(index2));
        elements.remove(index1+1);
        elements.add(index2,temp);
        elements.remove(index2+1);

    }
}
