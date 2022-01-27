package exercise1;

import java.util.Scanner;

public class GetToDecagon {

    public static void main(String arg[]){
        String firstDistance = "Board a bus heading to Benin from Osogbo Car Park. ";
        String firstAlight ="Once in Benin, alight at Akpakpava Terminal. ";
        String firstBusInBenin = "Take a bus from Akpakpava Terminal to Ring Road, Airport Road Junction. ";
        String secondBusInBenin = "From Airport Road Junction, take another bus heaading to estate gate, and alight by the police station. ";
        String thirdBusInBenin = "From that point, take a tricycle heading to Okhoromi community, and alight at Ohen junction. ";
        String finalDestination = "From that junction, take a motorcycle to Edo Tech Park. The facility is located by the roadside.";
        String welcome ="You are in Decagon Institute";



       System.out.println("1. " +  firstDistance);
       System.out.println("2. " + firstAlight);
       System.out.println("3. "+ firstBusInBenin);
       System.out.println("4. " + secondBusInBenin);
       System.out.println("5. " + thirdBusInBenin);
       System.out.println("6. " + finalDestination+welcome);

    }
}
