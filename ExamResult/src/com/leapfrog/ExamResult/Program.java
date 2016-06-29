    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ExamResult;

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
        String[] subjects = {"English", "Nepali", "Science", "Mathematics", "SocialStudies", "HPE", "Opt1", "Opt2"};
        double total = 0;
        double percentage;

        System.out.println("Choose what you want to do:");
        System.out.println("1. Compare The Marks");
        System.out.println("2. Calculate the marks");

        Scanner input = new Scanner(System.in);

        double[] marks = new double[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks For " + subjects[i]);
            marks[i] = input.nextDouble();

            if (marks[i] >= 32) {
                System.out.println("Coungratulations! You have passed :D ");

                total = total + marks[i];
                System.out.println("You Total Marks is" + total);

                percentage = (total / 800) * 100;
                System.out.println("Your percentage is + percentage");

                if ((percentage >= 80)) {
                    System.out.println(" You Achieved Distinction ");
                } else if (percentage >= 60 && percentage < 80) {
                    System.out.println(" You Achieved First Division ");
                } else if (percentage >= 45 && percentage < 60) {
                    System.out.println(" You have Achieved Second Division ");
                } else if (percentage >= 32 && percentage < 45) {
                    System.out.println(" Babu dherai gali khane bho ... ");
                }

            } else {
                System.out.println(" Sorry,You have failed :| ");

            }
        }

    }

}
