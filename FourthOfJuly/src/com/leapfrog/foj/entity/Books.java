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
public abstract class  Books {
    private String name;
    private int batchno;
    private String nameOfAurthor;
    private String price;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchno() {
        return batchno;
    }

    public void setBatchno(int batchno) {
        this.batchno = batchno;
    }

    public String getNameOfAurthor() {
        return nameOfAurthor;
    }

    public void setNameOfAurthor(String nameOfAurthor) {
        this.nameOfAurthor = nameOfAurthor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public abstract void read() ;
        
    

 
}
