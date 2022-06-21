import java.util.Scanner;

public class Articles {
    static class Article{
        String title;
        String content;
        String author;

        Article(String title, String content, String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        String getTitle(){
            return this.title;
        }

        void setTitle(String title){
            this.title=title;
        }

        String getContent() {
        return this.content;
        }

        void setContent(String content){
            this.content=content;
        }

        String getAuthor(){
            return this.author;
        }

        void setAuthor(String author){
            this.author=author;
        }

        @Override
        public String toString(){
            return String.format("%s - %s: %s",
            this.getTitle(),this.getContent(),this.getAuthor());
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int linesNum=Integer.parseInt(scanner.nextLine());

        String[] data=input.split(", ");
        Article article= new Article(data[0],data[1],data[2]);

        for (int i = 0; i < linesNum; i++) {
            input=scanner.nextLine();
            String command=input.split(": ")[0];
            String content=input.split(": ")[1];

            switch (command){
                case "Edit":
                    article.setContent(content);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(content);
                    break;
                case "Rename":
                    article.setTitle(content);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
