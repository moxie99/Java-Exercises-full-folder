package exercise1;


import java.util.Random;

public class DieRolling {

    public static void  main(String args[]){

        //initialization
            int gameEnd = 20;
            int throwMax = 4;
            int gameSpace = 0;

            //loop block for every throw
            for(int i = 0; i <=throwMax; i++){

                int diceMaxOutcome = 6;
                Random rand = new Random();
                int diceThrowOutcome = rand.nextInt(diceMaxOutcome);
                gameSpace = gameSpace + diceThrowOutcome;
                int gameSpacesToGo = gameEnd - gameSpace;
                System.out.println("You are currently on game space " + gameSpace + " and " + gameSpacesToGo + " spaces to go." );
            }
            if(gameSpace > 20){
                System.out.println("You are out of the game, " + gameSpace + " is a bug");
            }
            else  if(gameSpace == 20){
                System.out.println("You won the game, Congratulations");
            }
            else{
                System.out.println("You did not make the end, and out of the game ");
            }
    }
}
