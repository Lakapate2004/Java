/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class dog extends Animal {
    String breed;
    
    dog(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,String Specialabilit,boolean Hunting,String breed){
        super(Scientificname,lifespan,ModeofNutrition,Bloodtype,Specialabilit,Hunting);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    
    
    
}
