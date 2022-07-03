import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        int vowels=0;
        int consonants=0;
        int punctuation=0;

        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(path));

            String line=bufferedReader.readLine();

            while(line!= null){
                for (int i = 0; i < line.length(); i++) {
                    char currentChar=line.charAt(i);

                    if(currentChar==32){
                        continue;
                    }
                    if(isVowel(currentChar)){
                        vowels++;
                    }else if(isPunctiationMark(currentChar)){
                        punctuation++;
                    }else{
                        consonants++;
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

        try{
            PrintWriter printWriter=new PrintWriter("CountCharacters.txt");
            printWriter.println("Vowels: "+vowels);
            printWriter.println("Consonants: "+consonants);
            printWriter.println("Punctuation: "+punctuation);
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exists");
        }
    }

    private static boolean isPunctiationMark(char currentChar) {
        return (currentChar=='!') || (currentChar==',') || (currentChar=='.')||
                (currentChar=='?');
    }

    private static boolean isVowel(char currentChar) {
        return (currentChar=='a') || (currentChar=='e') || (currentChar=='i')||
                (currentChar=='o')||(currentChar=='u');
    }
}
