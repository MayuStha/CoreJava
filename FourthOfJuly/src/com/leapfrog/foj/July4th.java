/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.foj;

import com.leapfrog.foj.AircraftTypes.Helicopter;
import com.leapfrog.foj.entity.AirCrafts;
import com.leapfrog.foj.AircraftTypes.Aeroplane;
import com.leapfrog.foj.AircraftTypes.HotAirBaloon;

import com.leapfrog.foj.BooksTypes.Novel;
import com.leapfrog.foj.BooksTypes.Colouringbook;
import com.leapfrog.foj.BooksTypes.Storybook;
import com.leapfrog.foj.entity.Books;

import com.leapfrog.foj.TyperofClocks.GrandFatherClock;
import com.leapfrog.foj.TyperofClocks.WallClock;
import com.leapfrog.foj.TyperofClocks.WristWatch;
import com.leapfrog.foj.entity.Clocks;

import com.leapfrog.foj.DogTypes.Dalmation;
import com.leapfrog.foj.DogTypes.Labrador;
import com.leapfrog.foj.DogTypes.Pug;
import com.leapfrog.foj.entity.Dogs;

import com.leapfrog.foj.ExtinctAnimlasTypes.Dinosaurs;
import com.leapfrog.foj.ExtinctAnimlasTypes.SabertoothTiger;
import com.leapfrog.foj.ExtinctAnimlasTypes.Mamoth;
import com.leapfrog.foj.entity.ExtinctAnimals;

/**
 *
 * @author Dell
 */
public class July4th {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=========================");

        Books b = new Novel();
        b.setName("Faithful Encounters");
        b.setDate("5th July,2016");
        b.setNameOfAurthor("Mayukh");
        b.setPrice("Rs.100");
        b.setBatchno(1);
        b.read();
        System.out.println(b.getBatchno());
        System.out.println(b.getName());
        System.out.println(b.getNameOfAurthor());
        System.out.println(b.getPrice());
        System.out.println(b.getDate());
        System.out.println("=========================");
        /**

        System.out.println("=========================");
        AirCrafts a = new Helicopter();
        a.setName("La la la");
        a.setSize(200);
        a.setCapacity(150);
        a.fly();
        System.out.println(a.getCapacity());
        System.out.println(a.getName());
        System.out.println(a.getSize());
        System.out.println("=========================");
        /**
         * For Clocks System.out.println("========================="); Clocks c
         * = new GrandFatherClock(); c.setBatchNo(201); c.setMfd(2013);
         * c.setOwner(SpongBob); c.setPrice(5650);
         * System.out.println("=========================");
         */

        /**
         * For Dogs System.out.println("========================="); Dogs d= new
         * Dalmation(); d.setName("Snoopy"); d.setOwner("Rejan"); d.setAge(1);
         * d.setPrice(0); d.setSize("Negev");
         * System.out.println("=========================");
         */
        /**
         * For Extinct animals System.out.println("=========================");
         * ExtinctAnimals e= new Dinosaurs(); e.setName("Brachiosaurus");
         * e.setExtinctionDate("A Very VERY!!
         * Loooooooooooooooooooooooooooooooooooooooong time Ago! :D ");
         * e.setHabitat("Grassy Plains"); e.setSize(80);
         * System.out.println("=========================");
         */
    }

}
