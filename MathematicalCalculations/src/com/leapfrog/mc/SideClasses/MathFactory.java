/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mc.SideClasses;

/**
 *
 * @author Dell
 */
public class MathFactory {
    
    public static Main get(String Key){
        
        if(Key.equalsIgnoreCase("+")){
            return new Addition();
        }
        
        if(Key.equalsIgnoreCase("-")){
            return new Subtraction();
        }
        
        if(Key.equalsIgnoreCase("*")){
            return new Multiplication();
        }
        
        if(Key.equalsIgnoreCase("/")){
            return new Division();
        }
        return null;
        
        
    }
    
}
