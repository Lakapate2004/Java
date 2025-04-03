/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticalJava;

/**
 *
 * @author Hero
 */
public class cow extends Animal {
    int capacityofGivingmilk;
    
    public cow(String Scientificname , int lifespan ,String ModeofNutrition , String Bloodtype,String Specialabilit,boolean Hunting , int capacityofGivingmilk ){
     super(Scientificname,lifespan,ModeofNutrition,Bloodtype,Specialabilit,Hunting);
     this.capacityofGivingmilk = capacityofGivingmilk;
}
}
