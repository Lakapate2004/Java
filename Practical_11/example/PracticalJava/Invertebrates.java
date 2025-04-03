/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class Invertebrates extends LivingBeing {
    
    String bloodtype;
    public Invertebrates(String Scientificname , int lifespan ,String ModeofNutrition,String bloodtype){
        super(Scientificname,lifespan,ModeofNutrition);
        this.bloodtype = bloodtype;
    
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }
    
}
