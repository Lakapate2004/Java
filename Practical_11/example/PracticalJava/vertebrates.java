/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class vertebrates extends LivingBeing {
    String Bloodtype;
       
    public vertebrates( String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype){
        
        super(Scientificname,lifespan,ModeofNutrition);
        this.Bloodtype = Bloodtype;
    }

    public String getBloodtype() {
        return Bloodtype;
    }

    public void setBloodtype(String Bloodtype) {
        this.Bloodtype = Bloodtype;
    }
    
            
            
    
    
}
