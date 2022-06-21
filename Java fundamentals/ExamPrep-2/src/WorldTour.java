import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder stops=new StringBuilder(scanner.nextLine());
        String input=scanner.nextLine();

        while(!input.equals("Travel")){
            String[] data=input.split(":");
            String command=data[0];

            switch (command){
                case "Add Stop":
                    int index=Integer.parseInt(data[1]);
                    String text=data[2];
                    addStop(stops,index,text);
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int start=Integer.parseInt(data[1]);
                    int end=Integer.parseInt(data[2]);
                    removeStop(stops,start,end);
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString=data[1];
                    String newString=data[2];
                    switchStop(stops,oldString,newString);
                    System.out.println(stops);
                    break;
            }

            input=scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stops);

    }

    private static void addStop(StringBuilder text,int index,String insertText){
        if(text.length()>=index){
            text.insert(index,insertText);
        }
    }

    private static void removeStop(StringBuilder text,int start,int end){
        if(text.length()>=start && text.length()>=end){
            text.delete(start,end+1);
        }
    }

    private static void switchStop(StringBuilder text, String oldStr, String newStr){
       boolean contains=false;
       int startIndex=0;
       int endIndex=0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==oldStr.charAt(0)){
                for (int j = 0; j <oldStr.length(); j++) {
                    startIndex=i;
                    endIndex=i+oldStr.length();
                    if(text.charAt(i+j)!=oldStr.charAt(j)) {
                        contains=false;
                        break;
                    }else{
                        contains=true;
                    }
                }
            }else if(contains){
                break;
            }
        }

        if (contains) {
            text.delete(startIndex,endIndex);
            text.insert(startIndex,newStr);
        }
    }
}
