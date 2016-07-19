/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.foj.Extras;

/**
 *
 * @author Dell
 */
public class BookaAsExtras {
    
    private String Name,NameofAurthor,NameofEditors;
    private double Price;
    private int BatchNo;

    public BookaAsExtras() {
    }
    
    /**
     * Default Constructor rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
     */
    
    

    public BookaAsExtras(String Name, String NameofAurthor, String NameofEditors, double Price, int BatchNo) {
        this.Name = Name;
        this.NameofAurthor = NameofAurthor;
        this.NameofEditors = NameofEditors;
        this.Price = Price;
        this.BatchNo = BatchNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNameofAurthor() {
        return NameofAurthor;
    }

    public void setNameofAurthor(String NameofAurthor) {
        this.NameofAurthor = NameofAurthor;
    }

    public String getNameofEditors() {
        return NameofEditors;
    }

    public void setNameofEditors(String NameofEditors) {
        this.NameofEditors = NameofEditors;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(int BatchNo) {
        this.BatchNo = BatchNo;
    }
    
    
    
    
}
    
