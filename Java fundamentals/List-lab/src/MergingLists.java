import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List <String> firstList= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List <String> secondList=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List <String> resultList=new ArrayList<>();

        int length= sumLength(firstList,secondList);
        mergeArrays(firstList,secondList,resultList,length);
        writeBiggerList(firstList,secondList,resultList,length);
        printList(resultList);
    }


    public static int sumLength(List<String> firstList, List<String> secondList){
        int length=0;
        if(firstList.size()<secondList.size()){
            length= firstList.size();
        }else{
            length= secondList.size();
        }
        return  length;
    }

    public static void mergeArrays(List<String> firstList ,List<String> secondList, List<String>resultList,int length){
        for (int i = 0; i < length*2; i++) {
            if(i == 0){
                resultList.add(i, firstList.get(i));
            }else {
                if(i%2!=0) {
                    resultList.add(i, secondList.get(i/2));
                }else{
                    resultList.add(i, firstList.get(i/2));
                }
            }
        }
    }

    public static void writeBiggerList(List<String> firstList ,List<String> secondList, List<String>resultList,int length){
        if(firstList.size()<secondList.size()){
            for (int i = length*2; i <firstList.size()+secondList.size() ; i++) {
                resultList.add(i,secondList.get(i-length));
            }
        }else{
            for (int i = length*2; i <firstList.size()+secondList.size() ; i++) {
                resultList.add(i,firstList.get(i-length));
            }
        }
    }

    public static void printList(List<String> resultList){
        for(String number:resultList){
            System.out.print(number+" ");
        }
    }
}
