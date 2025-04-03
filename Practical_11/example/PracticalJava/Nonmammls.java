/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class Nonmammls extends vertebrates {
    
    boolean GivesBirthByEgg ;
    
    public Nonmammls(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,boolean GivesBirthByEgg){
        super(Scientificname,lifespan,ModeofNutrition,Bloodtype);
        this.GivesBirthByEgg = GivesBirthByEgg;
    }

    public boolean isGivesBirthByEgg() {
        return GivesBirthByEgg;
    }

    public void setGivesBirthByEgg(boolean GivesBirthByEgg) {
        this.GivesBirthByEgg = GivesBirthByEgg;
    }
    
    
}
