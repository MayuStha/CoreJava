/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.slcrlt;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ExamResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose what you want to do");
        System.out.println("1.Compare Marks");
        System.out.println("Calculater Only");
        
        double total;
        double percentage;
        double English, Nepali, Science, Mathematics, SocialStudies, HPE, Opt1, Opt2;
        
        

        System.out.println(" Fill the informations of the Subjects ");

        System.out.println(" Enter Marks of English: ");
        English = input.nextDouble();
        System.out.println(" Enter Marks of Nepali: ");
        Nepali = input.nextDouble();
        System.out.println(" Enter Marks of Science: ");
        Science = input.nextDouble();
        System.out.println(" Enter Marks of Mathematics: ");
        Mathematics = input.nextDouble();
        System.out.println(" Enter Marks of Social Studies");
        SocialStudies = input.nextDouble();
        System.out.println(" Enter Marks Of Health Population and Environment");
        HPE = input.nextDouble();
        System.out.println(" Enter Marks of Optional Subject 1: ");
        Opt1 = input.nextDouble();
        System.out.println(" Enter Marks of Optional Subject 2: ");
        Opt2 = input.nextDouble();

        
        
        if (English >= 32 && Nepali >= 32 && Science >= 32 && Mathematics >= 32 && SocialStudies >=32
                && HPE >= 32 && Opt1 >= 32 && Opt2 >= 32)
        {
            System.out.println("Congratulations! You Have Passed!");

            total = English + Nepali + Science + Mathematics + SocialStudies + HPE + Opt1 + Opt2;
            System.out.println("The Total Marks Scores is" + total);

            percentage = (total/800)*100 ;  
            
            System.out.println("Your Percentage is " + percentage);

                if (( percentage >= 80) )
                {
                        System.out.println(" You Achieved Distinction ");
                }
                else if (percentage >= 60 && percentage < 80 )
                {
                    System.out.println(" You Achieved First Division ");
                }
                else if (percentage >=45 && percentage < 60 )
                {
                    System.out.println(" You have Achieved Second Division ");
                }
                else if(percentage >=32 && percentage <45 )
                {
                    System.out.println(" Babu dherai gali khane bho ... ");
                }

            
        
        } 
        else    {
                System.out.println("Sorry, You have Failed");
                }

    }
}


