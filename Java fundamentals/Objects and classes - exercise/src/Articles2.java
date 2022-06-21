import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
        static class Article {
            String title;
            String content;
            String author;

            Article(String title, String content, String author) {
                this.title = title;
                this.content = content;
                this.author = author;
            }

            String getTitle() {
                return this.title;
            }

            void setTitle(String title) {
                this.title = title;
            }

            String getContent() {
                return this.content;
            }

            void setContent(String content) {
                this.content = content;
            }

            String getAuthor() {
                return this.author;
            }

            void setAuthor(String author) {
                this.author = author;
            }

            @Override
            public String toString() {
                return String.format("%s - %s: %s",
                        this.getTitle(), this.getContent(), this.getAuthor());
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int linesNum = Integer.parseInt(scanner.nextLine());
            List<Article> articleList = new ArrayList<Article>();

            for (int i = 0; i < linesNum; i++) {
                String input = scanner.nextLine();
                String[] data = input.split(", ");
                Article article=new Article(data[0],data[1],data[2]);

                articleList.add(article);
            }
            String endInput=scanner.nextLine();
            if(endInput.equals("title")|| endInput.equals("content") || endInput.equals("author")){
                articleList.stream()
                        .forEach(article -> System.out.println(article.toString()));
            }
        }
    }
