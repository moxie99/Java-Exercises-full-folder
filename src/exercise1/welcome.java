package exercise1;

import java.util.Scanner;

public class welcome {

    public static void main(String arg[]){

        System.out.println("Enter your name please: ");
        Scanner scanner = new Scanner(System.in);
        String YourName = scanner.next();

        scanner.close();


        System.out.println("Welcome to my workstation,  " + YourName);
    }
}

