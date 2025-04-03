/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class Bird extends Nonmammls {
    
    boolean fly ;
    
     public Bird(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,boolean GivesBirthByEgg,boolean fly){
        super (Scientificname,lifespan,ModeofNutrition,Bloodtype,GivesBirthByEgg);
        this.fly = fly ;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
}
