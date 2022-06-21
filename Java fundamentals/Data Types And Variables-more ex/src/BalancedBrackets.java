import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        boolean isBalanced=true;
        String finalString="";
        for (int i = 0; i < lines; i++) {
            String input=scanner.nextLine();
            finalString+=input;
        }

        for (int i = 0; i < finalString.length(); i++) {
            if(finalString.charAt(i)==40){
                for (int j = i+1; j <finalString.length() ; j++) {
                    if(finalString.charAt(j)==40){
                        isBalanced=false;
                    }else if(finalString.charAt(j)==41){
                        break;
                    }
                    i=j+1;
                }
            }else if(finalString.charAt(i)==41){
                isBalanced=false;
                break;
            }
        }

        if(isBalanced){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
