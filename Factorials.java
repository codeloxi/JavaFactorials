/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;
import java.util.Scanner;
/**
 *
 * @author jacob
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, factorial = 1;
        
        System.out.print("Please enter an integer to calculate the factorial: ");
        int numEntered = in.nextInt();
        
        if(numEntered < 0){
            
            while(numEntered < 0){
                System.out.println("Invalid entry - valid entry is an integer > 0");
                System.out.print("Enter a new value: ");
                numEntered = in.nextInt();
            
        }
        
        }
       
       for(i = 1; i <= numEntered; i++){
           factorial *= i;
           
       }
        System.out.printf("The factorial of: %d is: %d", numEntered, factorial);
        System.out.println();
    }
    
}
