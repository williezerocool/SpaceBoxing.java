/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceboxing;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class SpaceBoxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int answer, weight;
        double mars, venus, jupiter, saturn, uranus, neptune;
        
        mars = 0.39;
        venus = 0.78;
        jupiter = 2.65;
        saturn = 1.17;
        uranus = 1.05;
        neptune = 1.23;
        
        System.out.println("I have information for the following planets: \n 1. venus  2. mars  3. jupiter\n 4. saturn  5. uranus  6. neptune ");
        
        System.out.print("Which planet are you visiting? ");
        answer = keyboard.nextInt();
        
        System.out.print("Whats your earth weight? ");
        weight = keyboard.nextInt();
        
        if(answer == 1){
        
            System.out.println("Your weight would be " + (weight * venus) + " pounds on that planet.");
        }else if(answer == 2){
        
            System.out.println("Your weight would be " + (weight * mars) + " pounds on that planet.");
        }else if(answer == 3){
        
            System.out.println("Your weight would be " + (weight * jupiter) + " pounds on that planet.");
        }else if(answer == 4){
        
            System.out.println("Your weight would be " + (weight * saturn) + " pounds on that planet.");
        }else if(answer == 5){
        
            System.out.println("Your weight would be " + (weight * uranus) + " pounds on that planet.");
        }else if(answer == 6){
        
            System.out.println("Your weight would be " + (weight * neptune) + " pounds on that planet.");
        }else{
            System.out.println("error");
        }
    }
    
}
