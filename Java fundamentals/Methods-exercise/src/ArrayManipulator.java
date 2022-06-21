import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    if(isValidIndex(index,numbers.length)){
                        Exchange(index, numbers);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String type = input.split(" ")[1];
                    if (type.equals("even")) {
                        MaxEven(numbers);
                    } else if (type.equals("odd")) {
                        MaxOdd(numbers);
                    }
                    break;
                case "min":
                    String numberType = input.split(" ")[1];
                    if (numberType.equals("even")) {
                         MinEven(numbers);
                    } else if (numberType.equals("odd")) {
                         MinOdd(numbers);
                    }
                    break;
                case "first":
                    int numberOfElements = Integer.parseInt(input.split(" ")[1]);
                    String numType = input.split(" ")[2];
                    if(numberOfElements>numbers.length){
                        System.out.println("Invalid count");
                    }else {
                        if (numType.equals("even")) {
                            FirstEvenElements(numberOfElements, numbers);
                        } else if (numType.equals("odd")) {
                            FirstOddElements(numberOfElements, numbers);
                        }
                    }
                    break;
                case "last":
                    int numOfElements = Integer.parseInt(input.split(" ")[1]);
                    String numbersType = input.split(" ")[2];
                    if(numOfElements>numbers.length){
                        System.out.println("Invalid count");
                    }else {
                        if (numbersType.equals("even")) {
                            LastEvenElements(numOfElements, numbers);
                        } else if (numbersType.equals("odd")) {
                            LastOddElements(numOfElements, numbers);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static boolean isValidIndex(int index, int length) {
        boolean isValid = false;
        if (index <= length) {
            isValid = true;
        }
        return isValid;
    }

    public static void Exchange(int index, int[] array) {
        int[] beforeIndex = new int[index+1];
        int[] afterIndex = new int[array.length-index-1];
        for (int i = 0; i <= index; i++) {
                beforeIndex[i] = array[i];
        }
        for (int i = 0; i < afterIndex.length ; i++) {
            afterIndex[i]=array[index+1+i];
        }
        for (int i = 0; i < array.length; i++) {
            if (i < afterIndex.length) {
                array[i] = afterIndex[i];
            } else {
                array[i] = beforeIndex[i-afterIndex.length];
            }
        }
    }

    public static void MaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        if(maxIndex>-1) {
            System.out.println(maxIndex);
        }else{
            System.out.println("No matches");
        }
    }

    public static void MaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        if(maxIndex>-1) {
            System.out.println(maxIndex);
        }else{
            System.out.println("No matches");
        }
    }

    public static void MinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }
        if(minIndex>-1) {
            System.out.println(minIndex);
        }else{
            System.out.println("No matches");
        }
    }

    public static void MinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 != 0) && array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }
        if(minIndex>-1) {
            System.out.println(minIndex);
        }else{
            System.out.println("No matches");
        }
    }

    public static void FirstEvenElements(int numberOfElements, int[] array) {
        int[] evenElements = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && numberOfElements>0) {
                    evenElements[i] = array[i];
                    numberOfElements--;
                }else{
                    evenElements[i]=-1;
                }
            }
            printArr(evenElements);
        }


    public static void FirstOddElements(int numberOfElements, int[] array) {
        int[] oddElements = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0 && numberOfElements>0) {
                    oddElements[i] = array[i];
                    numberOfElements--;
                }else{
                    oddElements[i]=-1;
                }
            }
            printArr(oddElements);
        }


    public static void LastEvenElements(int numberOfElements, int[] array) {
        int[] evenElements = new int[array.length];

            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0 && numberOfElements>0) {
                    evenElements[i] = array[i];
                    numberOfElements--;
                }else{
                    evenElements[i]=-1;
                }
            }
            printArr(evenElements);
        }


    public static void LastOddElements(int numberOfElements, int[] array) {
        int[] oddElements = new int[array.length];
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0 &&  numberOfElements>0) {
                    oddElements[i] = array[i];
                   numberOfElements--;
                }else{
                    oddElements[i]=-1;
                }
            }
            printArr(oddElements);
        }

        public static void printArr(int[] array){
            System.out.print("[");
            boolean printFirst=true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] != -1){
                    if (printFirst) {
                        System.out.print(array[i]);
                        printFirst=false;
                    }else{
                        System.out.print(", "+array[i]);
                    }
                }
            }
            System.out.println("]");
        }

    }

