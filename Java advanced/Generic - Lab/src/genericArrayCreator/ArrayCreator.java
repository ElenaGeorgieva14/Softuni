package genericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {

    public static <T> T[] create(int length, T value){
        T[] arr= (T[])Array.newInstance(value.getClass(),length);

        Arrays.fill(arr,value);

        return arr;
    }

    public static <T> T[] create(Class<T> tclass, int length,T value){
        T[] arr= (T[]) Array.newInstance(tclass,length);
        Arrays.fill(arr,value);

        return arr;
    }
}
