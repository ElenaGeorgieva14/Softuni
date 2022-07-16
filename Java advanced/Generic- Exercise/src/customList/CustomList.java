package customList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>>{
    private List<T> data=new ArrayList<>();

    public List<T> getData(){
        return this.data;
    }

    public void add(T element) {
        data.add(element);
    }

    public T remove(int index) {
        return data.remove(index);
    }

    public boolean contains(T element) {
        return data.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp=data.get(index1);
        data.set(index1,data.get(index2));
        data.set(index2,temp);
    }

    public int countGreaterThan(T element) {
        return (int)data.stream().filter(value -> value.compareTo(element)>0).count();
    }

    public T getMax() {
        return data.stream().max(T :: compareTo).get();
    }

    public T getMin() {
        return data.stream().min(T :: compareTo).get();
    }

    public void print() {
        for(T item : data){
            System.out.println(item);
        }
    }
}
