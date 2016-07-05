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
    private int Batchno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchno() {
        return Batchno;
    }

    public void setBatchno(int Batchno) {
        this.Batchno = Batchno;
    }
    
    public abstract void read();

}
