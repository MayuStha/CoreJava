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
public class inputs {
    
    
    String[] subjects={"English","Nepali","Science","Mathematics","SocialStudies","HPE","Opt1","Opt2"};
       double total=0;
       double percentage;
       
       
       Scanner input=new Scanner(System.in);
       
       double[] marks=new double[subjects.length];
       
      for(int i=0;i<subjects.length;i++)
      {
          System.out.println("Enter marks For "+ subjects[i]);
          marks[i]=input.nextDouble();
      }
}
