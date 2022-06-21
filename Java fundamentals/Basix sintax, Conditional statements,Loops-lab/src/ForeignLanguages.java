import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String language= scanner.nextLine();

        if(language.equals("USA") || language.equals("England")) {
            System.out.println("English");
        }else if(language.equals("Spain") || language.equals("Argentina")
        || language.equals("Mexico")){
            System.out.println("Spanish");
        }else{
            System.out.println("unknown");
        }

    }
}
