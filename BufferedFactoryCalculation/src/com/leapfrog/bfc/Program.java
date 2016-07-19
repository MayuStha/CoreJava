/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.bfc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("e:/Leap Frog/HMFolder/Math.txt");
        try{
        System.out.println(file.createNewFile());
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
            
        }

    }

}
