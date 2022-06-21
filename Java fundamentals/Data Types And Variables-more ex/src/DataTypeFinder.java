import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String dataType="";
       while(!input.equals("END")){

           boolean isInt=true;
            try{
                int integer=Integer.parseInt(input);
            }catch(NumberFormatException e){
                isInt=false;
            }

           boolean isDouble=true;
           try{
               double doubleNum=Double.parseDouble(input);
           }catch(NumberFormatException e){
               isDouble=false;
           }

           if(isInt){
              dataType="integer";
           }else if(isDouble){
               dataType="floating point";
           }else if(input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
               dataType="boolean";
           }else if(input.length()==1){
               dataType="character";
           }else{
               dataType="string";
           }
           System.out.printf("%s is %s type%n",input,dataType);
            input=scanner.nextLine();
        }
    }
}
