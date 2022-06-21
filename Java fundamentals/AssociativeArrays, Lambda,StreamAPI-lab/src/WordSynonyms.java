import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int lines= Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> wordSynonyms=new LinkedHashMap<>();

        for (int i =0 ; i < lines; i++) {
            String word=scanner.nextLine();
            String synonym=scanner.nextLine();

            if(!wordSynonyms.containsKey(word)){
               wordSynonyms.put(word,new ArrayList<>());
            }
            wordSynonyms.get(word).add(synonym);
        }
       for(Map.Entry<String,ArrayList<String>>entry : wordSynonyms.entrySet()){
           System.out.println(entry.toString().replace("="," - ")
                   .replace("[","").replace("]",""));
       }
    }
}
