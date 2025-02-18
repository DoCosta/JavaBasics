package excercises_dominik_costa;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        // 5.7
        int z = 0;
        for(int i = 2; i <= 20; i++){
            if((z+i)%2 == 0){
                z += i;
            }
        }
        System.out.println(z);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        int numberLength = String.valueOf(number).length();
        int DIV = (int) Math.pow(10, numberLength);
        for(int i = 0; i < numberLength; i++){
            DIV /= 10;
            System.out.print((number/DIV)%10 + "   ");
        }
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numbers = String.valueOf(number);
        String[] num = numbers.split("");
        for(String i : num){
            System.out.print(i + "  ");
        }
        */


        /*
        System.out.print("\n\nEnter a five-digit number: ");
        int number2 = scanner.nextInt();

        int digit1 = number / 10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) / 10;
        int digit5 = number % 10;
        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);

        scanner.close();
        */
        // 5.9

    }
}

/*
5.3
int counter = 1;
        int number = 0;
        int largest = -1;

        while(counter <= 10){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number " + counter +": ");
            number = scanner.nextInt();
            if(number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println(largest);
 */

    // 5.4)
    //    int x = 0;
    //    x++;
    //    ++x;
    //    x+=1
    //    x = x + 1;

/* 5.5
    public static void main(String[] args) {
        int total = 0;
        for (int x = 0; x <= 10; x++) {
            int y = x * x;
            System.out.println(y);
            total += y;
        }
        System.out.println("Total is " + total);
    }


//5.6
        int counter = 1;
        int x = 1;
        while(counter <= 10){
            x += x;
            counter++;
        }
        System.out.println(x);

        int y = 1;
        for(int i = 1; i <= 10; i++){
            y += y;
        }
        System.out.println(x);

        // 5.7
        int z = 2;
        for(int i = 1; i <= 20; i++){
            if(z%2 == 0){
                z += z;
            }
        }
        System.out.println(z);
 */
/*
    5.8
        int posCounter = 0;
        int negCounter = 0;
        int zerosCounter = 0;
        int number;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.print("Number " + i +": ");
            number = scanner.nextInt();
            if(number == 0) {
                zerosCounter++;
            } else if (number > 0) {
                posCounter++;
            } else{
                negCounter++;
            }

        }
        System.out.println("Positive: " + posCounter);
        System.out.println("Negative: " + negCounter);
        System.out.println("Zero: " + zerosCounter);
        */