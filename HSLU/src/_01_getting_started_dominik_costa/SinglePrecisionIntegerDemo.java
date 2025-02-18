package _01_getting_started_dominik_costa;

public class SinglePrecisionIntegerDemo {
    public static void main(String[] args) {
        System.out.println("single precision integers: ");
        System.out.println(50);
        System.out.println(0);
        System.out.println(1_000_000);

        System.out.printf("%,d\n", 100000);
        System.out.printf("%d\n", 100000);
        System.out.printf("%.2f\n", 123.232); // rounds to .2
        System.out.printf("subtracting: 20 - 50.75 = %.2f\n", 20 - 50.75);
        System.out.printf("multiplication: 6.12 * 7= %.2f\n", 6.12 * 7);
        System.out.printf("division: 3/2.2= %.1f\n", 3 / 2.3);
    }
}
