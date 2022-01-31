package HackerRankQuestions;

public class sumOfArrayItems {

    public static void main(String args[]){

        int n = 6;
        int []  numbersArray= {1,2,3,4,5,6};
        int count = 0;
        for(int i = 0; i < n; i++){
            count+=numbersArray[i];
        }
        System.out.println(count);
    }

}
