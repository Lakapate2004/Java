/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class Animal extends mammals {
    boolean Hunting;
    
   public Animal(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,String Specialabilit,boolean Hunting){
            
    super(Scientificname,lifespan,ModeofNutrition,Bloodtype,Specialabilit);
    
}

    public boolean isHunting() {
        return Hunting;
    }

    public void setHunting(boolean Hunting) {
        this.Hunting = Hunting;
    }
    
}
    
