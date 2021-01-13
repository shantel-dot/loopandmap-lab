package com.tts;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	System.out.println("Give me five numbers");

	Scanner input = new Scanner(System.in);

        int smallest = 0;
        int large = 30;
        int num;
        int n = input.nextInt();
        num = input.nextInt();
        smallest = num;      //assume first entered number as a small one

        // i starts from 2 because we already took one num value
        for (int i =2; i < n; i++) {
            num = input.nextInt();

            // comparing each rime entered number with smallest one
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("the largest is: " + large);
        System.out.println("Smallest no is: " + smallest);



    }
}

	


