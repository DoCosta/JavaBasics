package programming_lessons;

import java.util.Scanner;

public class LowestDivider {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int numbera = scanner.nextInt();
        System.out.print("Enter number B: ");
        int numberb = scanner.nextInt();

        while(numbera != 0 && numberb != 0){
            if(numbera>numberb){
                numbera-=numberb;
            }else {
                numberb-=numbera;
            }
            System.out.println(numbera + " " + numberb);
        }
        if(numbera == 0){
            System.out.println(numberb);
        }else{
            System.out.println(numbera);
        }
    }
}
