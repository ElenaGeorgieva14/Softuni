import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> data= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command= scanner.nextLine();

        while(!command.equals("3:1")){
            String operation=command.split(" ")[0];
            int firstNumber=Integer.parseInt(command.split(" ")[1]);
            int secondNumber=Integer.parseInt(command.split(" ")[2]);

            switch (operation){
                case "merge":
                    mergeElements(firstNumber,secondNumber,data);
                    break;
                case "divide":
                    divideElements(firstNumber,secondNumber,data);
                    break;
            }
            command=scanner.nextLine();
        }
        data.forEach(el -> System.out.print(el+" "));
    }

    public static void divideElements(int index, int partition, List<String> data) {
        int partsLength=data.get(index).length()/partition;
        int lastPartLength=0;
        List<String>sublist=new ArrayList<>();
        if(data.get(index).length()%partition!=0){
            lastPartLength=data.get(index).length()%partition+partsLength;
        }
        for (int i = 0; i < data.get(index).length(); i+=partsLength) {
            if(lastPartLength!=0 && i>=lastPartLength){
                sublist.add(data.get(index).substring(i,i+lastPartLength));
                break;
            }else {
                sublist.add(data.get(index).substring(i, i + partsLength));
            }
        }
        data.remove(index);

        for (int i =sublist.size()-1 ; i >=0; i--) {
            data.add(index,sublist.get(sublist.size()-1));
            sublist.remove(sublist.size()-1);
        }
    }

    public static void mergeElements(int startIndex, int endIndex, List<String> data) {
        String newElement = "";

        if (startIndex < 0) {
            startIndex = 0;
        } else if (endIndex>data.size()) {
            endIndex=data.size()-1;
        }

        if (startIndex <= data.size() - 1 && endIndex <= data.size() - 1) {
            for (int i = startIndex; i <= endIndex; i++) {
                newElement += data.get(startIndex);
                data.remove(startIndex);
            }
            data.add(startIndex, newElement);
        }
    }
}
