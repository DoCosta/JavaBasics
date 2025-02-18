package _01_getting_started_dominik_costa;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public String brand;
    public int doors;
    public int tires;
    public ArrayList<String> Cars() {

        ArrayList<String> cars = new ArrayList<>();
        cars.add(brand);
        cars.add("VW");
        cars.add("Porsche");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.sort(null);
        System.out.printf("The Car %s has %d Doors and is on %d Wheels%n", brand, doors, tires);
        return cars;
    }

    public void Drive(){
        System.out.println("The Car is driving! ");
    }
}
