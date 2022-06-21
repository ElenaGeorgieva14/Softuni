import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int max2=0;
        int max=Math.max(n1,n2);
        int max1=Math.max(n2,n3);
        if(max>max1){
            max2=max;
        }else{
            max2=max1;
        }
        int min2=0;
        int min=Math.min(n1,n2);
        int min1=Math.min(n2,n3);
        if(min<min1){
            min2=min;
        }else{
           min2=min1;
        }
        int middle=n1+n2+n3-max2-min2;

        System.out.println(max2);
        System.out.println(middle);
        System.out.println(min2);
    }
}

