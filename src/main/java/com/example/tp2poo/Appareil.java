package com.example.tp2poo;
import java.util.Date;

public class Appareil {
    private String se;
    private String marque;
    private String modele;
    private String ecran;
    private String id;
    private String couleur;
    private Date dachat;
//CONSTRUCTEUR
    public Appareil(String se,String marque,String modele,String ecran,String id,String couleur,Date dachat){
        this.marque=marque;
        this.couleur=couleur;
        this.dachat=dachat;
        this.ecran=ecran;
        this.id=id;
        this.modele=modele;
    }
//GETTERS
    public Date getDachat() {
        return dachat;
    }
    public String getCouleur() {
        return couleur;
    }
    public String getEcran() {
        return ecran;
    }
    public String getId() {
        return id;
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }

    public String getSe() {
        return se;
    }
    //SETTERS
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setDachat(Date dachat) {
        this.dachat = dachat;
    }
    public void setEcran(String ecran) {
        this.ecran = ecran;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setSe(String se) {
        this.se = se;
    }
}

