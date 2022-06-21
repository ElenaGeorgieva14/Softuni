import java.util.*;

public class Songs {
    static class Song{
        String typeList;
        String name;
        String time;
         Song(String typeList, String name, String time){
            this.typeList=typeList;
            this.name=name;
            this.time=time;
        }
        String getTypeList(){
             return this.typeList;
        }
        String getName(){
             return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Song>songList=new ArrayList<Song>();
        int numberOfSongs=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfSongs; i++) {
            String data=scanner.nextLine();
            String typeList=data.split("_")[0];
            String name=data.split("_")[1];
            String time=data.split("_")[2];

            Song song=new Song(typeList,name,time);
            songList.add(song);
        }
        String output=scanner.nextLine();

        if(output.equals("all")){
            for(Song song : songList){
                System.out.println(song.getName());
            }
        }else{
            for(Song song : songList){
                if(song.getTypeList().equals(output)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
