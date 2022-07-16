package genericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values =new ArrayList<>();

    public Box(List<T> values){
        this.values=values;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            stringBuilder.append(String.format("%s: %s%n",values.get(i).getClass().getName(),values.get(i).toString()));
        }

        return stringBuilder.toString();
    }
}
