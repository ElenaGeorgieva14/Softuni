package genericCountMethodString;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends  Comparable<T>> {
    private List<T> values =new ArrayList<>();

   public Box(List<T> values){
        this.values=values;
    }

    @Override
    public String toString(){
       StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            stringBuilder.append(String.format("%s: %s%n",values.get(i).getClass().getName(),values.get(i)));
        }

       return stringBuilder.toString();
    }

    public int count( T elementToCompare){
     return (int) values.stream().filter(itemFromOurBox -> itemFromOurBox.compareTo(elementToCompare)>0).count();
    }
}
