/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class mammals extends vertebrates {
        String Specialability;
        
       public mammals(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,String Specialabilit){
        
        super(Scientificname,lifespan,ModeofNutrition,Bloodtype);
    
}

    public String getSpecialability() {
        return Specialability;
    }

    public void setSpecialability(String Specialability) {
        this.Specialability = Specialability;
    }
        
}
