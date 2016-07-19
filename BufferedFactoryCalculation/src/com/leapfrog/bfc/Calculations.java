/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.bfc;

import java.util.Scanner;
import com.leapfrog.bfc.Program;

/**
 *
 * @author Dell
 */
public abstract class Calculations { 
    Scanner input=new Scanner(System.in);
    
    public void calMethods(){
        while(true){
        
        System.out.print("Enter the Value of x:");
        int x=input.nextInt();
        System.out.println("");
        System.out.print("Enter the Value of y:");
        int y=input.nextInt();
        System.out.println("");
        
        System.out.println("♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪");
        System.out.println("Enter waht You want to do[1-7]");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Find Lesser Value");
        System.out.println("6. Find Greater Value");
        System.out.println("7. Exit");
        System.out.println("♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪");
        
        
        

        int choice =input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("");
                break;
            }
            case 2: {
                
                break;
            }
            case 3: {
                
                break;
            }
            case 4: {
                
                break;
            }
            case 5: {
                
                break;
            }
            case 6: {
                
                break;
            
            }
        }
            System.out.println("Do you Want Continue Operations?[Y/N]");
            String option=input.next();
            
            if(option.equalsIgnoreCase("n")){
                System.out.println("Have a Nice Day :) ");
                System.exit(0);
            }
                  
  
            
            }
    }
    
    
    
}
