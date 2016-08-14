/* Concept Practice 3

Create a program that acts as a database for cars. Create a car object that
stores the year, mpg, and driving type. Then create at least 3 classes that
inherits these values and stores the make and model of the car.
    Have the values for each car accessible through a menu in the main and 
include an option to add another vehicle.

* Public, Private, Protected
* this operator
* Enumeration
* Static and final
* Inheritance

*/

package conceptpractice_java_3;

import java.util.Scanner;


public class ConceptPractice_Java_3 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int input = 0, index = 1;
        
        
        
        Nissan car1 = new Nissan(2015, 32, "Automatic", "Versa", "SV");
        Toyota car2 = new Toyota(2011, 40, "Automatic", "Camry", "SE");
        Hyundi car3 = new Hyundi(2016, 24, "Manual", "Sonata", "L");
        
        Car []cars = new Car[9];
        cars[0] = car1;
        index++;
        cars[1] = car2;
        index++;
        cars[2] = car3;
        index++;
        
        do{
            System.out.printf("Car Database\n"
                    + "=====================\n"
                    + "1: [Add Car]\n");
            for(int i = 1; i < index; i++){
                System.out.printf("%d: Car %d\n", i+1, i);
            }
            System.out.printf("-1: [Quit]\n"
                    + "=====================\n"
                    + "Enter Selection: ");
            
            input = userIn.nextInt();
            
            if(input == -1){
                System.out.println("Goodbye!");
            }
            else {
                if(input == 1){
                    System.out.printf("\n\nSelect Company"
                            + "\n===================\n"
                            + "1: Nissan\n"
                            + "2: Toyota\n"
                            + "3: Hyundai\n"
                            + "====================\n"
                            + "Select: ");
                    input = userIn.nextInt();
                    userIn.nextLine();
                    
                    if(input == 1){
                            Nissan carTemp = new Nissan();
                            
                            System.out.print("\nEnter Make: ");
                            carTemp.setModel(userIn.nextLine());
                            
                            System.out.print("\nEnter Model: ");
                            carTemp.setModel(userIn.nextLine());
                            
                            System.out.print("\nEnter Year: ");
                            carTemp.setYear(userIn.nextInt());
                            
                            System.out.print("\nEnter Mpg: ");
                            carTemp.setMpg(userIn.nextFloat());
                            userIn.nextLine();
              
                            System.out.print("\nEnter Engine Type: ");
                            carTemp.setEngine(userIn.nextLine());
                            
                            cars[index] = carTemp;
                            index++;
                            break;
                    }
                    else if(input == 2){
                            Toyota carTemp = new Toyota();
                            
                            System.out.print("\nEnter Make: ");
                            carTemp.setModel(userIn.nextLine());
                            
                            System.out.print("\nEnter Model: ");
                            carTemp.setModel(userIn.nextLine());
                            
                            System.out.print("\nEnter Year: ");
                            carTemp.setYear(userIn.nextInt());
                            
                            System.out.print("\nEnter Mpg: ");
                            carTemp.setMpg(userIn.nextFloat());
                            userIn.nextLine();
              
                            System.out.print("\nEnter Engine Type: ");
                            carTemp.setEngine(userIn.nextLine());
                            
                            cars[index] = carTemp;
                            index++;
                    }
                    else if(input == 3){
                            Toyota carTemp = new Toyota();

                            System.out.print("\nEnter Make: ");
                            carTemp.setModel(userIn.nextLine());

                            System.out.print("\nEnter Model: ");
                            carTemp.setModel(userIn.nextLine());

                            System.out.print("\nEnter Year: ");
                            carTemp.setYear(userIn.nextInt());

                            System.out.print("\nEnter Mpg: ");
                            carTemp.setMpg(userIn.nextFloat());
                            userIn.nextLine();

                            System.out.print("\nEnter Engine Type: ");
                            carTemp.setEngine(userIn.nextLine());

                            cars[index] = carTemp;
                            index++;
                    }
                        
                    
                    
                    
                    
                }
                else{
                    for(int i = 1; i < index; i++){
                        if(input == i+1){
                            System.out.printf("\n\nCar %d"
                                    + "\n==================\n",
                                    i);
                            cars[i-1].output();
                            
                            System.out.printf("\n===================\n"
                                    + "Enter any number to continue: \n");
                            userIn.nextFloat();
                            System.out.printf("\n\n\n");
                            
                        }
                    }
                
                }

                
            }
        
        
        }while(input != -1);
        
        
        
    }
    
    
    
}
