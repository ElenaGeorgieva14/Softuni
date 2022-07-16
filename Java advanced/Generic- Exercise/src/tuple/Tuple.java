package tuple;

public class Tuple <T,K> {
    private T item1;
    private K item2;

    Tuple(T item1, K item2){
        this.item1=item1;
        this.item2=item2;
    }

    public T getItem1(){
        return  this.item1;
    }

    public K getItem2(){
        return this.item2;
    }

}
