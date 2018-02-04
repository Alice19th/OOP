package Wk1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Enter degree(C): ");
        Scanner input  = new Scanner(System.in);
        double celsius = input.nextDouble();

        double fahrenheit = (9.0/5)*celsius +32;
        System.out.println("The Fahrenheit is: "+ fahrenheit);
    }
}
