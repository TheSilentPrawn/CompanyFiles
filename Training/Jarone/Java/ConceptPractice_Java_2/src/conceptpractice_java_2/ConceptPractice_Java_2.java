/* Concept Practice 2

Create a calculator class in another file. 
The class must be able to receive any sequence of numbers with their respective
signs and return the answer.

Class calculator
    -double []numbers
    -double ans

    +Cosntructor
    +gets/sets
    +calculate
    +add
    +subtract
    +divide
    +multiply



* Using multiple classes
* Methods and instances
* Constructors
* Random number generator
* Arrays
* Multidimensional arrays

*/


package conceptpractice_java_2;

import java.util.Scanner;


public class ConceptPractice_Java_2 {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner userIn = new Scanner(System.in);
        int uInput = 0;
        float []num = {0,0};
        
        do{
            System.out.println("Calculator\n"
                    + "Select Function:\n"
                    + "0: Add\n"
                    + "1: Subtract\n"
                    + "2: Multiply\n"
                    + "3: Divide\n"
                    + "4: Quit\n"
                    + "=================");
            uInput = userIn.nextInt();
            
         
            if(uInput >=0 && uInput <=3){
                for (int i = 0; i < num.length; i++){
                    System.out.printf("Enter number %d:", i+1);
                    num[i] = userIn.nextFloat();
                }
            }
            
            
            switch(uInput){
                case 0:
                    calculator.add(num);
                    System.out.printf("\n\n%.2f + %.2f = \nAnswer: %.2f\n\n",
                            num[0],num[1], calculator.getAns());
                    break;
                    
                case 1:
                    calculator.subt(num);
                    System.out.printf("\n\n%.2f - %.2f = \nAnswer: %.2f\n\n",
                            num[0],num[1], calculator.getAns());
                    break;
                    
                case 2:
                    calculator.multi(num);
                    System.out.printf("\n\n%.2f * %.2f = \nAnswer: %.2f\n\n",
                            num[0],num[1], calculator.getAns());
                    break;
                case 3:
                    calculator.div(num);
                    System.out.printf("\n\n%.2f /0"
                            + " %.2f = \nAnswer: %.2f\n\n",
                            num[0],num[1], calculator.getAns());
                    break;
                    
                case 4:
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("\n\nInvalid input!\n\n");
            }
        
        }while(uInput != 4);
        
        
       
    }
    
}
