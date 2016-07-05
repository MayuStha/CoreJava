/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.foj.entity;

/**
 *
 * @author Dell
 */
public abstract class Clocks {
    private int BatchNo;
    private int Mfd;
    private String Owner;
    private double Price;

   

    public int getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(int BatchNo) {
        this.BatchNo = BatchNo;
    }

    public int getMfd() {
        return Mfd;
    }

    public void setMfd(int Mfd) {
        this.Mfd = Mfd;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
}
