package HackerRankQuestions;

import java.util.Scanner;

public class SolveMeFirst {

    public static void main(String args[]){
        System.out.println("Enter the first value:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int b = scanner.nextInt();

        int total = a + b;

        System.out.println(total);

        scanner.close();
    }
}
