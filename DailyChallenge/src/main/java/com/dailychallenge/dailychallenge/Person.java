/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailychallenge.dailychallenge;

/**
 *
 * @author kernel-mk
 */
public class Person {

    private String nom;    
    private int age;
    private double salaire;
    
    public  Person(){
        
    }
    
    public Person(String nom,int age,double salaire){
        this.nom = nom;
        this.age =age;
        this.salaire = salaire;
    }
    
    public Person(String nom,int age){
        this.nom =nom;
        this.age = age;
        this.salaire = -1;
    }
    
    
    public void DisplayInfo(){

        if(this.salaire != -1){
            System.out.println("Les informations: "
            + "Nom: " + this.nom +", "
            +"Age: " +this.age +"Ans, "
            +"Salaire: " +this.salaire
        );
        }else{
        
            System.out.println("Les informations: "
                + "Nom: " + this.nom +", "
                +"Age: " + this.age +"Ans, "
                +"Salaire non fourni"
            );
        
        }
    }
    
}
