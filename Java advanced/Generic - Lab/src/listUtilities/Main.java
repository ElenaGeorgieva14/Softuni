package listUtilities;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        Collections.addAll(integerList,1,2,18,2,-1);

        List<String> strings=new ArrayList<>();
        Collections.addAll(strings,"a","b","c");

        int minString= ListUtils.getMin(integerList);
        System.out.println(minString);

    }
}
