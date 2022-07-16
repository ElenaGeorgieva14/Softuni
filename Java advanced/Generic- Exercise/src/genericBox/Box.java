package genericBox;


import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<String> values =new ArrayList<>();

   public Box(List<String> values){
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
}
