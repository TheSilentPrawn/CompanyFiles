/* Java Concept Practice

Power calculator

* Variables
* Input/output
* Math operations
* Incrementations
* If/switch statements
* Loops
*/

package pkg0_conceptpractice;

//Import libarary for the java scanner
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Create variables
        int num, pow, ans=0;

        //Title
        System.out.println("Power calculator");
        
        //Create input scanner
        Scanner userIn = new Scanner(System.in);
        
        //Prompt user for number
        System.out.print("Enter a number: ");
        //Receive number input
        num = userIn.nextInt();
        //Error check
        if(num < 0) num = 0;
        
        
        
        //Prompt user for power       
        System.out.print("Enter a power: ");
        //Receive input for power
        pow = userIn.nextInt();
        //Error check
        if(pow < 0) pow = 0;
        
        //If
        if(num > 0){
            ans = 1;
            
            for(int i = 0; i < pow; i++){
                ans*=num;
            }
      
        }
        
        System.out.printf("\nAnswer: %d\n", ans);
       
    }
    
}
