import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> lessons= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("course start")){
            String[] commands=input.split(":");
            String operation=commands[0];
            String lessonTitle=commands[1];
            switch (operation){
                case "Add":
                    addLesson(lessons,lessonTitle);
                    break;
                case "Insert":
                    int index=Integer.parseInt(commands[2]);
                    insertLesson(lessons,lessonTitle,index);
                    break;
                case "Remove":
                    removeLesson(lessons,lessonTitle);
                    break;
                case "Swap":
                    String secondLessonTitle=commands[2];
                    swapLessons(lessons,lessonTitle,secondLessonTitle);
                    break;
                case "Exercise":
                    addExercise(lessons,lessonTitle);
                    break;
            }
            input=scanner.nextLine();
        }
        printList(lessons);
    }

    public static void addLesson(List<String>lessons,String lessonTitle){
        if(!lessons.contains(lessonTitle)){
            lessons.add(lessonTitle);
        }
    }
    public static void insertLesson(List<String>lessons,String lessonTitle,int index){
        if(!lessons.contains(lessonTitle)){
            lessons.add(index,lessonTitle);
        }
    }

    public static void removeLesson(List<String>lessons,String lessonTitle){
        if(lessons.contains(lessonTitle)){
            lessons.remove(lessonTitle);
        }
        if(lessons.contains(lessonTitle+"-Exercise")){
            lessons.remove(lessonTitle+"-Exercise");
        }
    }
    public static void swapLessons(List<String>lessons,String title1,String title2){
       int index1=lessons.indexOf(title1);
       int index2=lessons.indexOf(title2);
        if(lessons.contains(title1) && lessons.contains(title2)){
            String temp=lessons.get(index1);
            lessons.set(index1,title2);
            lessons.set(index2,temp);
        }
        if(lessons.contains(title1+"-Exercise")){
            int index=lessons.indexOf(title1+"-Exercise");
            lessons.add(lessons.indexOf(title1)+1,title1+"-Exercise");
            lessons.remove(index+1);
        }else if(lessons.contains(title2+"-Exercise")){
            int index=lessons.indexOf(title2+"-Exercise");
            lessons.add(lessons.indexOf(title2)+1,title2+"-Exercise");
            lessons.remove(index+1);
        }
    }

    public static void addExercise(List<String>lessons,String title){
            if(lessons.contains(title) && !lessons.contains(title+"-Exercise")){
                int index=lessons.indexOf(title);
                lessons.add(index+1,title+"-Exercise");
        }else if(!lessons.contains(title)){
                lessons.add(title);
                lessons.add(title+"-Exercise");
            }
    }

    public static void printList(List<String>lessons){
        for (int i = 0; i <lessons.size(); i++) {
            System.out.printf("%d.%s%n",i+1,lessons.get(i));
        }
    }
}
