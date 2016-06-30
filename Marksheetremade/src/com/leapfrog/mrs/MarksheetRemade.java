/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mrs;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MarksheetRemade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] students = {"Ram", "Sita", "Hari", "Shyam"};
        String[] subjects = {"English", "Nepali", "Math", "Science"};
        double[][] marks = new double[students.length][subjects.length];
        double total = 0;
        double percentage = 0;
        double[] totals = new double[subjects.length];
        // double passmarks=32;

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the marks obtained by " + students[i]);

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(" in " + subjects[j] + ":");
                marks[i][j] = input.nextDouble();

                total = total + marks[i][j];

                for (int t = 0; t < subjects.length; t++) {
                    totals[t] = total;

                    //      if("English">=32 && "Nepali">=32 && "Math">=32 && "Science">=32 ){
                    //      System.out.println("Hello :)");
                    //  }
                    if (marks[i][j] >= 32) {

                        //  System.out.println("Congratulations!! You Have Passed");
                        if (totals[t] >= (32 * subjects.length)) {
                            System.out.println("Congratulations!! You have Passed");
                            System.out.println("Your Toal is" + totals[t]);

                            percentage = (totals[t] / (100 * subjects.length) * 100);
                            System.out.println("Your Percentage is "+ percentage);

                            if (percentage > 80) {
                                System.out.println("You Have Achived Distinction");
                            } else if (percentage >= 60 && percentage < 80) {
                                System.out.println("You Have Achived First Division");
                            } else if (percentage >= 45 && percentage < 60) {
                                System.out.println("You Have Achived Second Division");
                            } else if (percentage >= 32 && percentage < 45) {
                                System.out.println("Bro.... You have my Condolence");
                            }
                            break;

                        }
                    } else {
                        System.out.println("Sorry, You Have Failed");

                    }
                }

            }

        }
    }
}
