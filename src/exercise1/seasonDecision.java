package exercise1;

import java.util.Scanner;

public class seasonDecision {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What season of the year is it?: ");
        String season = scanner.next();
        System.out.println("Give an whole number, please?: ");
        int wholeNumber = scanner.nextInt();
        System.out.println("Give an adjective(a word to describes a noun e.g beautiful): ");
        String adjective = scanner.next();

        scanner.close();
        System.out.println("On a " + adjective +" " + season + " " + "say, I drink a minimum of " + wholeNumber + " cups of coffee. " );


    }
}
