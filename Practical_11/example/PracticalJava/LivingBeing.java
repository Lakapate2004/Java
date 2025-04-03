/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class LivingBeing {
    String Scientificname;
    int lifespan;
    String ModeofNutrition;
    
     public LivingBeing( String Scientificname , int lifespan ,String ModeofNutrition ){
        
        this.Scientificname = Scientificname;
        this.lifespan = lifespan;
        this.ModeofNutrition = ModeofNutrition;
    }
        
  
    public void setScientificname(String Scientificname) {
        this.Scientificname = Scientificname;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setModeofNutrition(String ModeofNutrition) {
        this.ModeofNutrition = ModeofNutrition;
    }

    public String getScientificname() {
        return Scientificname;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getModeofNutrition() {
        return ModeofNutrition;
    }
    
}
