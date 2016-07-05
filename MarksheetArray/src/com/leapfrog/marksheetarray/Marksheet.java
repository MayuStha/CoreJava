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
public class Marksheet {
    int fullMarks=100;
    int passMarks=32;
    boolean isFail=false;
    double percentage=0;
    double totalMarks=0;
    int[] marks;
    String[] subjects;
    Scanner input;
    
    //Construct
    public Marksheet(String[] subjects, Scanner input){
        this.subjects = subjects;
       marks= new int[subjects.length];
    }
    
    
    public void marksInput(){
        try{
        for(int i=0;i<=marks.length;i++){
            System.out.println("Enter the Marks of "+ subjects[i] +":");
            marks[i] = input.nextInt();
           
            totalMarks += marks[i]; 
        }
        System.out.println("The Total marks is: " + totalMarks);
        }
        catch(NullPointerException ex){
            System.out.println("this " + ex.getMessage());
        }
    }
    
    public boolean isFail(){
        for(int i=0;i<marks.length;i++){
            if(marks[i]<passMarks){
                return true;
            }  
        }
        return false;
    }
    
    public void getPercentage(){
        if(isFail=true){
            
             percentage = (totalMarks/(fullMarks*subjects.length))*100;
             System.out.println("The percentage is"+ percentage + "%");
         }
    }
    
}
