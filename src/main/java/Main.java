/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        long t1 = System.currentTimeMillis();
        
        int sum = sumOfNumbers(number);
        
        long t2 = System.currentTimeMillis();
        long lengthOfTime = t2-t1;
        
        System.out.println(sum);

        System.out.println("Wizard time: ");
        t1 = System.currentTimeMillis();

        sum = gaussianSumOfNumbers(number);

        t2 = System.currentTimeMillis();

        System.out.println(sum);

        long gaussylength = t2-t1;

        if (lengthOfTime < gaussylength)
            System.out.println("The Wizard has been defeated!");
        else if (lengthOfTime > gaussylength)
            System.out.println("Gaussian Method has won! The Wizard has Triumphed");
        else
            System.out.println("They are the same!");

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {//added static
        int counter = 1;
        int add = 0;
        while (counter != (n+1)){
            add = add + counter;
            ++counter;
        }
        return add;
    }
    
    
    static int getInputNumber() {//added Static
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) { //This is much faster but for ints, not very helpful
        int add = n*(n+1);
        add = add/2;
        return add;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
