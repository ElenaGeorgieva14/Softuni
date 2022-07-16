package customList;

import java.util.Collections;

public class Sorter <T extends Comparable<T>>{
    public void Sort(CustomList<T> customList){
     Collections.sort(customList.getData());
    }
}
