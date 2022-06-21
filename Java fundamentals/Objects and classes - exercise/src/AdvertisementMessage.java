import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    static class Message{
        String[] phrases={"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events={"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=Integer.parseInt(scanner.nextLine());
        Message message=new Message();
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            System.out.printf("%s %s %s – %s%n",
                    message.phrases[random.nextInt(message.phrases.length)],
                    message.events[random.nextInt(message.events.length)],
                    message.authors[random.nextInt(message.authors.length)],
                    message.cities[random.nextInt(message.cities.length)]);
        }
    }
}
