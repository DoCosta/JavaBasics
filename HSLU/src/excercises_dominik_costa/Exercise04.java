package excercises_dominik_costa;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        boolean isCorrect = true;
        while(isCorrect){
            isCorrect = false;
            System.out.println("1 for odd, 2 for multiple, 3 for compare, 4 for sorting");
            System.out.print("--------> ");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    oddOrEven();
                    break;
                case 2:
                    multiple();
                    break;
                case 3:
                    compare();
                    break;
                case 4:
                    sizeOfNumbers();
                    break;
                default:
                    System.out.println("Try again: ");
                    isCorrect = true;
            }
        }
    }
    static void oddOrEven(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    static void multiple(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int number1 = scanner.nextInt();
        System.out.print("Second number:");
        int number2 = scanner.nextInt();
        while(number2 == 0){
            System.out.println("Enter number2 again, not 0!");
            number2 = scanner.nextInt();
        }
        if(number1%number2 == 0){
            System.out.println("Is a multiple: " + number1/number2);
        }else{
            System.out.println("Is not a multiple: " + number1/number2);
        }
    }

    static void compare(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int number1 = scanner.nextInt();
        System.out.print("Second number:");
        int number2 = scanner.nextInt();
        if(number1 > number2){
            System.out.println(number1 + "is greater");
        }else if(number2 > number1){
            System.out.println(number2 + "is greater");
        } else if (number2 == number1) {
            System.out.println("These numbers are equal");
        }
    }
    static void sizeOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number:");
        int number1 = scanner.nextInt();
        System.out.print("Second number:");
        int number2 = scanner.nextInt();
        System.out.print("Third number:");
        int number3 = scanner.nextInt();

        int[] numbers = {number1, number2, number3};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0] + " and " + numbers[numbers.length-1]);
    }

}
