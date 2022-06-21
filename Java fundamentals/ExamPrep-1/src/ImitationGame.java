import java.util.Scanner;

public class ImitationGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder message=new StringBuilder(scanner.nextLine());

        String input=scanner.nextLine();

        while(!input.equals("Decode")){
            String[] data=input.split("\\|");
            String command=data[0];

            switch(command){
                case "Move":
                    int letters=Integer.parseInt(data[1]);
                    Move(message,letters);
                    break;
                case "Insert":
                    int index=Integer.parseInt(data[1]);
                    String value=data[2];
                    message.insert(index,value);
                    break;
                case "ChangeAll":
                    String substring=data[1];
                    String replacement=data[2];
                    changeAll(message,substring,replacement);
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",message);
    }
    private static void Move(StringBuilder text,int number){
        String firstPart=text.substring(0,number);
        text.delete(0,number);
        text.append(firstPart);
    }

    private static void changeAll(StringBuilder text,String substring,String replacement){
        for (int i = 0; i < text.length(); i++) {
            if(substring.contains(text.charAt(i)+"")){
                text.deleteCharAt(i);
                text.insert(i,replacement);

            }
        }
    }
}
