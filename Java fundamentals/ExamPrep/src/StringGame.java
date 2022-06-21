import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder text=new StringBuilder(scanner.nextLine());
        String input=scanner.nextLine();

        while(!input.equals("Done")){
            String[] data=input.split(" ");
            String command=data[0];

            switch(command){
                case "Change":
                    String oldChar=data[1];
                    String replacement=data[2];
                    text= change(text,oldChar,replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String substring=data[1];

                    if(includes(text,substring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "End":
                    substring=data[1];

                    if(end(text,substring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text=uppercase(text);
                    System.out.println(text);
                    break;
                case "FindIndex":
                    oldChar=data[1];
                    int index=findIndex(oldChar,text);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex=Integer.parseInt(data[1] );
                    int count=Integer.parseInt(data[2]);
                    String deleted=cut(text,startIndex,count);
                    System.out.println(deleted);
                    break;
            }

            input=scanner.nextLine();
        }
    }

    private static String cut(StringBuilder text, int startIndex, int count) {
        String deleted=text.substring(startIndex,startIndex+count);
        text.delete(startIndex,startIndex+count);
        return deleted;
    }

    private static int findIndex(String oldChar, StringBuilder text) {
        int index=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == oldChar.charAt(0)) {
                index=i;
                break;
            }
        }
        return index;
    }

    private static StringBuilder uppercase(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i)>=97 && text.charAt(i)<=122)) {
                text.insert(i,(char) (text.charAt(i) -32));
                text.deleteCharAt(i+1);
            }

        }
        return text;
    }

    private static boolean end(StringBuilder text, String substring) {
         boolean isEnd=false;

        for (int i = text.length()-1; i >=0; i--) {
            if(text.charAt(text.length()-1)==substring.charAt(substring.length()-1)){
                for (int j =substring.length()-1; j >= 0 ; j--) {
                    if(text.charAt(i)==substring.charAt(j)){
                        isEnd=true;
                        i--;
                    }else{
                        isEnd=false;
                        break;
                    }
                }
            }else{
                break;
            }
            if(isEnd){
                break;
            }
        }
    return isEnd;
    }

    private static boolean includes(StringBuilder text, String substring) {
        boolean isIncluded=false;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==substring.charAt(0)){
                for (int j = 0; j <substring.length() ; j++) {
                    if(text.charAt(i+j)==substring.charAt(j)){
                        isIncluded=true;
                    }else{
                        isIncluded=false;
                        break;
                    }
                }
            }
            if(isIncluded){
                break;
            }
        }
        return isIncluded;
    }

    private static StringBuilder change(StringBuilder text, String oldChar, String replacement) {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==oldChar.charAt(0)){
                text.deleteCharAt(i);
                text.insert(i,replacement);
            }
        }
        return text;
    }
}
