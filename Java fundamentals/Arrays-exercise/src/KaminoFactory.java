import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int maxSequence=0;
        int lastestIndex=0;
        int[] bestDNA=new int[length];
        int bestSum=0;
        int sampleCounter=0;
        int bestSample=0;
        while (!input.equals("Clone them!")) {
            int[] DNA = new int[length];
            sampleCounter++;
            int sum=0;
            int sequence = 0;
            int tempMaxSequence = 0;
            int lastIndex=0;
            for (int i = 0; i < DNA.length; i++) {
                DNA[i] = Integer.parseInt(input.split("!+")[i]);
                sum+=DNA[i];
            }
            for (int i = 1; i < length; i++) {
                if (DNA[i] == DNA[i - 1] && DNA[i] == 1) {
                    sequence++;
                    if (sequence > tempMaxSequence) {
                        tempMaxSequence = sequence;
                        lastIndex=i-sequence;
                    }
                } else {
                    sequence = 0;
                }
            }
            if(tempMaxSequence>maxSequence){
                maxSequence=tempMaxSequence;
                lastestIndex=lastIndex;
                bestSum=sum;
                bestSample=sampleCounter;
                System.arraycopy(DNA, 0, bestDNA, 0, length);
            }else if(tempMaxSequence==maxSequence){
                if(lastIndex<lastestIndex){
                    bestSample=sampleCounter;
                    bestSum=sum;
                    lastestIndex=lastIndex;
                    System.arraycopy(DNA, 0, bestDNA, 0, length);
                }else if(lastIndex==lastestIndex){
                    if(bestSum<sum){
                        bestSum=sum;
                        bestSample=sampleCounter;
                        System.arraycopy(DNA, 0, bestDNA, 0, length);
                    }
                }
            }
            input = scanner.nextLine();
        }
        //printing
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSample,bestSum);

        for (int item: bestDNA) {
            System.out.print(item +" ");
        }
    }
}
