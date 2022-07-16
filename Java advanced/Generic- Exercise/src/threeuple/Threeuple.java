package threeuple;

public class Threeuple <T,K,M>{

    private T item1;
    private K item2;
    private M item3;

    Threeuple(T item1,K item2,M item3){
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;
    }

    public T getItem1() {
        return item1;
    }

    public K getItem2() {
        return item2;
    }

    public M getItem3() {
        return item3;
    }

    public void print(){
        System.out.printf("%s -> %s -> %s%n",item1.toString(),item2.toString(),item3.toString());
    }
}
