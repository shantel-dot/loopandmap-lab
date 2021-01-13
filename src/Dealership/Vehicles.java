package Dealership;
import java.util.Scanner;
import java.util.HashMap;

public class Vehicles {
    public static void main(String[] args) {




    Scanner input = new Scanner(System.in);
        System.out.println("What car model are you looking for?");
            System.out.println("We only have certain type of Honda's in stock");

    String carModel = input.nextLine();

    // create an empty HashMap
    HashMap<String,String> car = new HashMap<>();

    //Add cars to our inventory
        car.put("Civic", "Honda");
        car.put("Cruze", "Chevrolet");
        car.put("Coralla", "Toyota");
        car.put("Lexus", "Toyota");
        car.put("F-150", "Ford");

    //filter out cars
        if(car.containsKey(carModel)) {
        System.out.println("Our Honda selection is over here");
    } else {
        System.out.println("Unfortunately we don't have that model");
    }
}
}