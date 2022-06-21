import java.util.Scanner;

public class CalculateRectangleArea {
    public static int CalculateArea(int width,int height){
        return width*height;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        System.out.println(CalculateArea(width,height));
    }
}
