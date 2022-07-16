package JarOfT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Jar<String>jar =new Jar<>();

        jar.add("jam");
        jar.add("pickles");
        jar.add("chilli");

        String removed=jar.remove();
        System.out.println(removed);
    }
}
