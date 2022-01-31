//package Exercise5;
//
//import java.util.Scanner;
//
//public class PhoneBillCalculator {
//
//    static Scanner scanner = new Scanner(System.in);
//
//
//    public static void main(String args[]){
//
//        double planFee = getPlanFee();
//        int averageMinuteUsed = getAverageMinuteUsed();
//        double overPlanAmount = calculateOverPlan();
//        double subTotalAmount = customerSubTotal();
//
//        scanner.close();
//
//        double subTotal = customerSubTotal();
//
//        calculateTax();
//
//        calculateOverPlan();
//
//        finalTotal();
//
//        printBill();
//
//        }
////getting customers plan fee
//    public static double getPlanFee(){
//        System.out.println("Dear customer, enter your plan fee please: ");
//        double customerPlanFee = scanner.nextDouble();
//        return customerPlanFee;
//    }
//
//
//    //getting customers average minutes used
//    public static int getAverageMinuteUsed(){
//        System.out.println("Dear customer, enter your average number of minutes used: ");
//        int customerAverageMinuteUsed = scanner.nextInt();
//        return customerAverageMinuteUsed;
//    }
//
//    //method to calculate subtotal
//    public static double customerSubTotal(double planFee){
//        return planFee;
//    }
//    //method to calculate tax
//    public static double calculateTax(double subTotal){
//        double tax = 0.15 * subTotal;
//        return  tax;
//    }
//
//    //method to calculate charges for using over plan
//    public static double calculateOverPlan(int averageMinuteUsed, double planFee){
//        if(averageMinuteUsed > planFee){
//            double overPlan = (averageMinuteUsed - planFee) * 0.25;
//            return overPlan;
//        }
//        else {
//            return 0;
//        }
//    }
//
//    //method for calculating final total
//    public static double finalTotal(double overPlanAmount){
//
//        double finalTotal =
//    }
//
//
//    public static String printBill(){
//
//    System.out.println("Your plan fee is " + planfee + " and your average minutes used is. " + " Your over plan is " + overPlan + " and your final " +
//            "total is" " finalTotal"  );
//    }
//
//
//
//}
