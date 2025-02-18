package excercises_dominik_costa;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        // 7.1
        for(int i = 0; i < 30; i++){
            System.out.println(Math.round(Math.random()*10));
        }
        // 7.2
        for(int i = 0; i < 20; i++){
            System.out.println(Math.round(Math.random()*100000));
        }
        // 7.3
        Random rand = new Random();
        for(int i = 0; i < 15; i++){
            System.out.println(rand.nextInt(-5, 5));
        }
        // 7.4
        for(int i = 0; i < 15; i++){
            System.out.println(rand.nextInt(0, 6));
        }
        // 7.5
        for(int i = 0; i < 1000; i++){
            System.out.println(rand.nextInt(0, 6));
        }

        // 7.6
        Scanner scanner = new Scanner(System.in);
        String[] iceCream = {"Chocolate", "Vanilla", "Strawberry", "Almond", "Caramel", "Watermelon"};
        System.out.print("How many scoops do you want?");
        int numberOfScoops = scanner.nextInt();

        for(int i = 0; i < numberOfScoops; i++){
            System.out.println(iceCream[rand.nextInt(iceCream.length)]);
        }

        // 7.7
        System.out.println("\n\nGame starts now!");
        System.out.print("Enter your number: ");
        int machine = Math.toIntExact(Math.round(Math.random() * 100));
        int number = 200;
        while (machine != number){
            Scanner userInput = new Scanner(System.in);
            number = userInput.nextInt();
            System.out.println(number);
            if(machine > number){
                System.out.println("Greater");
                System.out.println("Try Again!");
            } else if (machine < number) {
                System.out.println("Lower");
                System.out.println("Try Again!");
            }
            else{
                System.out.println("\nYou Won!");
            }
        }


    }
}
