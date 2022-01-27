package exercise1;

import java.util.Scanner;

public class CoinConverter {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your quantities of pennies:");
        double penniesAmount = scanner.nextDouble();
        double penniesInDollars = penniesAmount / 100;

        System.out.println("Enter your quantities of nickels: ");
        double nickelAmount = scanner.nextDouble();
        double nickelInDollars = nickelAmount / 20;


        System.out.println("Enter your quantities of dimes: ");
        double dimeAmount = scanner.nextDouble();
        double dimeInDollars = dimeAmount / 10;

        System.out.println("Enter your quantities of quarters: ");
        double quarterAmount = scanner.nextDouble();
        double quarterIndollars = quarterAmount / 4;

        double totalCoinInDollars = penniesInDollars + nickelInDollars + dimeInDollars + quarterIndollars;


        scanner.close();


        System.out.println(totalCoinInDollars);


        if(totalCoinInDollars > 1){
            double difference = totalCoinInDollars - 1;
            System.out.println("Your total is above $1 by " + difference);
        }else{
            double difference = 1 - totalCoinInDollars;
            System.out.println("Your total is short of $1 by " + difference);
        }

    }
}
