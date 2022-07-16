package genericScale;

public class Scale <T extends Comparable<T>>{

    private T left;
    private T right;

    public Scale(T left, T right){
        this.left=left;
        this.right=right;
    }

    public T getHeavier(){

        if(right.compareTo(left)>0){
            return right;
        }else if(right.compareTo(left)<0){
            return left;
        }else{
            return null;
        }
    }
}
