package class1;

import java.lang.reflect.Array;

public class firstName {

    public static void main(String args[]){
        String firstName;

        firstName = "Oluwasegun";

        System.out.println(firstName);

        char studentGrade = 'A';


        System.out.println(studentGrade);

        ///split the string firstname which gives an array
         String [] firstNameChar = firstName.split("");


        //loop through the array based on its length
        for (int i=0; i<firstNameChar.length;i++){

            //print each item at every iteration
            System.out.println(firstNameChar[i]);
        }




    }

}
