package excercises_dominik_costa;

import java.util.Scanner;

public class Exercise03 {
            // A)
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("add 1: Enter 1 | calc 3: Enter 3 | circle 4: Enter 4 | infos 5: Enter 5");
                int check = scanner.nextInt();
                if(check == 1) {
                System.out.print("Enter number 1: ");
                int x = scanner.nextInt();
                System.out.print("Enter number 2: ");
                int y = scanner.nextInt();
                System.out.print("Enter number 3: ");
                int z = scanner.nextInt();
                int result = x + y + z;
                System.out.println(result);
                }else if(check == 3){
                    System.out.print("Enter number 1: ");
                    int x = scanner.nextInt();
                    System.out.print("Enter number 2: ");
                    int y = scanner.nextInt();
                    calculate(x,y);
                }else if(check == 4){
                    System.out.print("Enter number 1: ");
                    int x = scanner.nextInt();
                    circleCalculator(x);
                }else if(check == 5){
                    personalInformations();
                }
            }

            private static void calculate(int x, int y){
                System.out.println("Sum: " + (x+y));
                System.out.println("Sub: " + (x-y));
                System.out.println("Mul: " + (x*y));
                System.out.println("Div: " + (x/y));
                System.out.println("Rev: " + (x%y));
            }

            private static void circleCalculator(int r){
                double pi =  Math.PI;
                System.out.println("Diameter: " + 2*r);
                System.out.println("Circumference: " + 2*r*pi);
                System.out.println("Area: " + pi*(r*r));
            }

            private static void personalInformations(){
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Please enter following Information: ");
                System.out.print("Name: ");
                String name = scanner2.next();
                System.out.print("Age: ");
                int age = scanner2.nextInt();
                System.out.print("Country: ");
                String country = scanner2.next();

                System.out.println("\n" + name + " | "  + age + " | " + country);
            }
}
