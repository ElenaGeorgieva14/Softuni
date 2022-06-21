import javax.lang.model.type.ArrayType;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        Collections.reverse(arrays);

        String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "");
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);
    }

}
