
import com.example.PracticalJava.vertebrates;
import com.example.PracticalJava.cow;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hero
 */
public class main {
    
    public static void main(String[] args) {
        vertebrates vb = new vertebrates("felis catus",20,"obligate carnivores","warm");
        System.out.println("for vertebrates");
        System.out.println("Scientificname - " + vb.getScientificname()+"\n"+ "Lifespan - " + vb.getLifespan()+"\n"+ "ModeofNutrition - " + vb.getModeofNutrition()+"\n"+"Bloodtype - " +vb.getBloodtype());
    
    
    cow c = new cow("Bos taurus",10,"grass","warm Blooded","High quality mik",false,40);
    System.out.println("Jersey cow ");
    System.out.print("Scientificname - " + c.getScientificname()+"\n"+ "Lifespan - " + c.getLifespan()+"\n"+ "ModeofNutrition - " + c.getModeofNutrition()+"\n"+"Bloodtype - " + c.getBloodtype());
}
}
