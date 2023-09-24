package Q1L1;
import java.util.Scanner;
/*
Name: Anshuman Aggarwal
Student Number: 251301559
Date: 9/19/2023
*/

public class TestingExecutionTime {
    public static Scanner input = new Scanner(System.in);//Making a static Scanner to use in any method in the class

    public static void myHeader(int labExercise){System.out.printf("Lab Exercise %d-Q1\nPrepared By: Anshuman Aggarwal\nStudent Number: 251301559\nGoal of this Exercise: Execution time between recursive and iterative solutions",labExercise);}
    public static void myFooter(int labExercise){System.out.printf("Completion of Lab Exercise %d-Q1 is successful!\nSigning off - Anshuman",labExercise);}
    public static double interativeMethodForFactorial(int num){
        double result = 1;
        for(int i=1; i<=num; i++) result *= i;
        return result;
    }
    public static double recursiveMethodForFactorial(int num){
        if(num==0) return 1;//base case
        else return num*recursiveMethodForFactorial(num-1);
    }


    public static void main(String[] args){
        //Header
        System.out.print("=======================================================\n");
        myHeader(1);
        System.out.printf("\n=======================================================\n");

        int userNum;//var that stores user input
        do{
            System.out.printf("Enter an integer number: ");
            userNum = input.nextInt();
        }while(userNum<0);//will loop till input is 0 or greater

        double nanoStartTime = System.nanoTime();//Activating nanoTime()
        double result = 1;
        for(int i=1; i<=userNum; i++) result *= i;
        double nanoEndTime = System.nanoTime();//Activating and storing nanoTime()
        System.out.printf("Factorial (%d): %.0e\nTime taken by iterative solution inside main: %.2e sec",userNum,result,(nanoEndTime-nanoStartTime)/1_000_000_000);
        nanoStartTime = System.nanoTime();//Activating nanoTime()
        double fact1 = interativeMethodForFactorial(userNum);//Calling iterative method
        nanoEndTime = System.nanoTime();//Activating and storing nanoTime()
        System.out.printf("\nFactorial (%d) with iterative method: %.0e",userNum,fact1);
        System.out.printf("\nTime taken by iterative method call: %.2e sec",(nanoEndTime-nanoStartTime)/1_000_000_000);

        nanoStartTime = System.nanoTime();//Activating nanoTime()
        double fact2 = recursiveMethodForFactorial(userNum);//Calling recursive method
        nanoEndTime = System.nanoTime();//Activating and storing nanoTime()
        System.out.printf("\nFactorial (%d) with recursive call: %.0e",userNum,fact2);
        System.out.printf("\nTime taken by recursive method call: %.2e sec",(nanoEndTime-nanoStartTime)/1_000_000_000);

        //Footer
        System.out.print("\n=======================================================\n");
        myFooter(1);
        System.out.print("\n=======================================================");
    }
}
