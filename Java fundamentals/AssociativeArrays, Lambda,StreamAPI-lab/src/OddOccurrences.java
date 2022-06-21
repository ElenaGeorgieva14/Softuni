import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> wordsArray=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Map<String,Integer> words=new LinkedHashMap<>();

        for (int i = 0; i < wordsArray.size(); i++) {
            String currentWord=wordsArray.get(i).toLowerCase();
            if(words.containsKey(currentWord)){
                words.put(currentWord,words.get(currentWord)+1);
            }else{
                words.put(currentWord,1);
            }
        }
        List<String> odds=new ArrayList<>();

        for(Map.Entry<String,Integer>entry :words.entrySet()){
            if(entry.getValue()%2!=0){
               odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            if(i< odds.size()-1){
                System.out.print(odds.get(i)+", ");
        }else{
                System.out.print(odds.get(i));
            }

        }

    }
}
