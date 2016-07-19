/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.bfc.entity;
import com.leapfrog.bfc.Calculations;

/**
 *
 * @author Dell
 */
public class Minimum extends Calculations{
    
    public double result(double x,double y){
        if(x<y){
            return x;
        }
        else{
            return y;
        }
}
    
}
