/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.foj.BooksTypes;
import com.leapfrog.foj.entity.Books;
/**
 *
 * @author Dell
 */
public class Novel extends Books  {

    @Override
    public void read() {
        System.out.println(getName()+" Novel is being read.");
    }
    
    
}
