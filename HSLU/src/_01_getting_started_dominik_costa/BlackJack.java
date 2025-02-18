package _01_getting_started_dominik_costa;
import java.io.Console;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BlackJack{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean wantsToPlay = true;
        while(wantsToPlay){
            int[] cardsPlayer = new int[6];
            int[] cardsDealer = new int[6];
            int counter = 2;
            int sum = 0;
            int check = 0;
            boolean isFinished = false;
            int i = 0;
            Random rand = new Random();
            cardsPlayer[0] = rand.nextInt(2,12);
            cardsPlayer[1] = rand.nextInt(2,12);
            cardsDealer[0] = rand.nextInt(2,12);

            System.out.println("Welcome to Blackjack!");
            while (!isFinished){
                sum = 0;
                sum = summary(cardsPlayer);
                if(sum > 21){
                    System.out.println("You are over 21: " + sum + " You Loose!" );
                    break;
                }
                check = hitOrStand(cardsPlayer, cardsDealer, sum, counter);
                if(check == sum){
                    System.out.println("Dealers part:");
                    isFinished = true;
                    int sumD = dealer(cardsDealer);
                    System.out.println("Dealer has " + sumD + " you have " + sum);
                    if( sumD > sum && sumD <= 21){
                        System.out.println("Dealer Wins");
                    }else{
                        System.out.println("You Win!");
                    }

                    break;
                }
                if(check != sum && !isFinished) {
                    cardsPlayer[counter] = check;
                    counter++;
                }

            }
            System.out.print("Want to play again? Enter y: ");

            if(!Objects.equals(scanner.next(), "y")){
                wantsToPlay = false;
            }
        }
    }
    public static int summary(int[] cards){
        int currentSum = 0;
        for(int i : cards){
            currentSum += i;
        }

        return currentSum;
    }

    public static int hitOrStand(int[] cardsPlayer, int[] cardsDealer, int sumPlayer, int counter){
        Random rand = new Random();

        int sumDealer = 0;
        String decision = "h";
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Your cards are: " + Arrays.toString(cardsPlayer));
        sumPlayer = summary(cardsPlayer);
        System.out.println("Your current Summary is: " + sumPlayer);
        System.out.println("--------------------------------------");
        System.out.println("Dealers card is: " + cardsDealer[0]);
        sumDealer = summary(cardsDealer);
        System.out.println("Dealers current Summary is: " + sumDealer);
        System.out.println("--------------------------------------");
        System.out.println("Enter h for hit and p to pass");
        decision = scanner.next();
        switch (decision){
            case "h":
                return rand.nextInt(2,12);
            case "p":
                return sumPlayer;
        }
        return sumPlayer;
    }

    public static int dealer(int[] cards){
        Random rand = new Random();
        int sum = summary(cards);
        while(true) {
            if (sum <= 16) {
                sum = sum + rand.nextInt(2, 12);
                System.out.println(sum);
            }else{return sum;}
            if (sum > 21) {
                System.out.println("You won! dealer is over with: " + sum);
                return sum;
            }
        }
    }
}
