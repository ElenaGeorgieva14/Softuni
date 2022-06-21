import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThePianist {
    static class Piece{
        String piece;
        String composer;
        String key;

        Piece(String piece,String composer,String key){
            this.piece=piece;
            this.composer=composer;
            this.key=key;
        }

        String getName(){
            return this.piece;
        }
        void setPiece(String piece){
            this.piece=piece;
        }

        String getComposer(){
            return this.composer;
        }
        void setComposer(String composer){
            this.composer=composer;
        }

        String getKey(){
            return this.key;
        }
        void setKey(String key){
            this.key=key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        List<Piece> collection =new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] data=scanner.nextLine().split("\\|");
            Piece piece=new Piece(data[0],data[1],data[2]);
            collection.add(piece);
        }


        String input=scanner.nextLine();

        while(!input.equals("Stop")){
            String[] data=input.split("\\|");
            String command=data[0];

            switch(command){
                case "Add":
                    String piece=data[1];
                    String composer=data[2];
                    String key=data[3];
                    addPiece(collection,piece,composer,key);
                    break;
                case "Remove":
                    piece=data[1];
                    remove(collection,piece);
                    break;
                case "ChangeKey":
                    piece=data[1];
                    key=data[2];
                    changeKey(collection,piece,key);
                    break;
            }

            input=scanner.nextLine();
        }
        collection.forEach(piece -> System.out.printf("%s -> Composer: %s, Key: %s%n",piece.getName(),piece.composer,piece.getKey()));
    }

    private static void changeKey(List<Piece> collection, String piece, String key) {
       boolean isChanged=false;
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).getName().equals(piece)){
                collection.get(i).setKey(key);
                System.out.printf("Changed the key of %s to %s!%n",piece,key);
                isChanged=true;
                break;
            }
        }
        if(!isChanged){
            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
        }
    }

    private static void addPiece(List<Piece>list,String piece,String composer,String key){
        boolean exist=false;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getName().equals(piece)){
                exist=true;
                break;
            }
        }

        if(exist){
            System.out.printf("%s is already in the collection!%n",piece);
        }else{
            Piece piece1=new Piece(piece,composer,key);
            list.add(piece1);
            System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);

        }
    }

    private static void remove(List<Piece>collection,String piece){
        boolean exist=false;
        int elementIndex=0;
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).getName().equals(piece)){
                elementIndex=i;
                exist=true;
                break;
            }
        }

        if(exist){
            collection.remove(elementIndex);
            System.out.printf("Successfully removed %s!%n",piece);
        }else{
            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
        }
    }
}
