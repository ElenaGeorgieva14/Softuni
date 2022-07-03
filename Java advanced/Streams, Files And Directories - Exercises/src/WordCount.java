import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String,Integer> wordsCount=new HashMap<>();


        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(path));

            String line=bufferedReader.readLine();

            while(line != null){
                String[] words=line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    wordsCount.putIfAbsent(words[i],0);
                }

                line=bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }

        String secondPath="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(secondPath));

            String line=bufferedReader.readLine();
            while(line != null){
                String[] words=line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if(wordsCount.containsKey(words[i])){
                        wordsCount.put(words[i],wordsCount.get(words[i])+1);
                    }
                }

                line=bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }

        Map<String,Integer> sortedMap=new LinkedHashMap<>();
       wordsCount.entrySet().stream()
               .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
               .forEachOrdered(x -> sortedMap.put(x.getKey(),x.getValue()));


       Set<Map.Entry<String,Integer>> entries=sortedMap.entrySet();

        try{
            PrintWriter printWriter=new PrintWriter("WordCount.txt");
            for(var entry: entries){
                printWriter.println(entry.getKey()+" - "+entry.getValue());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }

        System.out.println();
    }
}
