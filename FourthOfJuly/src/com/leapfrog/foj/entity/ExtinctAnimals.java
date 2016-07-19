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
public abstract class ExtinctAnimals {
    private String name;
    private String extinctionDate;
    private int size;
    private String habitat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtinctionDate() {
        return extinctionDate;
    }

    public void setExtinctionDate(String extinctionDate) {
        this.extinctionDate = extinctionDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

   
    
    
}
