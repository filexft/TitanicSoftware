/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lycee
 */
public class Passager {
    private String identifiant ; 
    private int classe, age, sexe, survivant;
    public Passager (String id, int clas, int ag,int  sex,int  surviv){
        identifiant = id;
        classe = clas;
        age = ag;
        sexe = sex;
        survivant = surviv;
    }    

    public String getIdentifiant() {
        return identifiant;
    }

    public int getClasse() {
        return classe;
    }

    public int getAge() {
        return age;
    }

    public int getSexe() {
        return sexe;
    }

    public int getSurvivant() {
        return survivant;
    }

    @Override
    public String toString() {
        return "Passager{" + "identifiant=" + identifiant + ", classe=" + classe + ", age=" + age + ", sexe=" + sexe + ", survivant=" + survivant + '}';
    }
    
}
