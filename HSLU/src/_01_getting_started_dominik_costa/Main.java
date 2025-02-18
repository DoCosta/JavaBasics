package _01_getting_started_dominik_costa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cars car1 = new Cars();
        System.out.print("Enter a Car brand: ");
        car1.brand = scanner.next();
        System.out.print("Enter amount of Doors: ");
        car1.doors = scanner.nextInt();
        System.out.print("Enter amount of wheels: ");
        car1.tires = scanner.nextInt();
        car1.Drive();

        Cars car2 = new Cars();
        System.out.print("Enter a Car brand: ");
        car2.brand = scanner.next();
        System.out.print("Enter amount of Doors: ");
        car2.doors = scanner.nextInt();
        System.out.print("Enter amount of wheels: ");
        car2.tires = scanner.nextInt();
        car2.Drive();

        ArrayList<Cars> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        for( Cars i : myCars){
            System.out.println(i.brand);
            System.out.println(i.tires);
        }
        car1.Cars();
        car2.Drive();
        System.out.println(car1.Cars());
    }
}