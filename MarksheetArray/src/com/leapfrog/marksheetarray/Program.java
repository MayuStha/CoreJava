/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheetarray;

import java.util.Scanner;

/**
 *
 * @author Suman Heuju
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner initialize
        Scanner input = new Scanner(System.in);
        String[] subjects={"math","sci","nep"};
        
        Marksheet m = new Marksheet(subjects, input);
        m.marksInput();
        
        if(m.isFail()){
          System.out.println("You are failed!");
      }
      else{
        m.getPercentage();
      }
    }
    
}
