/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class Human extends mammals {
    
    String think ;
    
    Human (String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,String Specialability ,String think){
         
        super(Scientificname,lifespan,ModeofNutrition,Bloodtype,Specialability);
    }

    public String getThink() {
        return think;
    }

    public void setThink(String think) {
        this.think = think;
    }
    
    
}
