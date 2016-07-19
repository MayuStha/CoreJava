/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gc;

import com.leapfrog.gc.Entity.Student;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> nameList=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        

        while (true) {
            
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search by Id");
            System.out.println("5. Exit");

            System.out.println("Enter What you want to do: [1-5]");
            int choice=input.nextInt();
            

            switch(choice){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        }
    }

}
