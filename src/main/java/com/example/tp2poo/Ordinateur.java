package com.example.tp2poo;

import java.sql.Date;

public class Ordinateur extends Appareil {
    private String ramspeed;
    private String ports;
    //CONSTRUCTEUR
    public Ordinateur(String se, String marque, String modele, String ecran, String id, String couleur, Date dachat,String ramspeed,String ports) {
        super(se, marque, modele, ecran, id, couleur, dachat);
        this.ramspeed=ramspeed;
        this.ports=ports;
    }
    //GETTERS
    public String getPorts() {
        return ports;
    }
    public String getRamspeed() {
        return ramspeed;
    }
    //SETTERS
    public void setRamspeed(String ramspeed) {
        this.ramspeed = ramspeed;
    }
    public void setPorts(String ports) {
        this.ports = ports;
    }
}
