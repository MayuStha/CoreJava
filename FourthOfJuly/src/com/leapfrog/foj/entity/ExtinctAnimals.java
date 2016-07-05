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
    private String Name;
    private String ExtinctionDate;
    private int Size;
    private String Habitat;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getExtinctionDate() {
        return ExtinctionDate;
    }

    public void setExtinctionDate(String ExtinctionDate) {
        this.ExtinctionDate = ExtinctionDate;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
    
    
    
}
