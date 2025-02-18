package excercises_dominik_costa;

import javax.swing.*;
import java.sql.Array;
import java.util.*;

public class Exercise06 {
    public static void main(String[] args) {
        // Table 6.1)
        JFrame frame = new JFrame();

        String[] columnNames  = {"Index","Number"};
        Object[][] numbers = {columnNames, {0, 4}, {1, 1}, {2, 22}, {3, 9}, {4, 14}, {5, 3}, {6, 9}};
        JTable table = new JTable(numbers, columnNames);
        table.setRowHeight(25);

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,30*numbers.length);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        /*
        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(1, "4");
        numbers.put(2, "1");
        numbers.put(3, "22");
        numbers.put(4, "9");
        numbers.put(5, "14");
        numbers.put(6, "3");
        numbers.put(7, "9");
        System.out.println("Index | Number");
        for(int i : numbers.keySet()){
            System.out.println("    " + i + " | " + numbers.get(i));
        }
        */
        // 6.2
        /*
        // Declaration and instantiation
        String[] favoriteMovies = new String[3];

        // Initialization
            favoriteMovies[0] = "The Matrix";
            favoriteMovies[1] = "Inception";
            favoriteMovies[2] = "Interstellar";

        // Output the contents
            for (String movie : favoriteMovies) {
                System.out.println(movie);
            }

         */

        // 6.3
        /*
        int[] number = {1, 2, 1, 2, 1, 2, 1, 3, 3, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number between 1 - 4: ");
        int input = scanner.nextInt();
        int counter = 0;
        for(int i : number){
            if (i == input) {
                counter++;
            }
        }
        System.out.println("The number " + input + " exists: " + counter + " times.");
        */

        // 6.4
        int[] array1 = new int[101];
        for(int i = 100; i <= 200; i++){
            array1[i-100] = i;
        }

        System.out.println(Arrays.toString(array1));

        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for(int i = 100; i <= 200; i++){
            array2.add(i);
        }
        System.out.println(array2);

        Iterator<Integer> it = array2.iterator();
        System.out.print("[");
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
    }
}
