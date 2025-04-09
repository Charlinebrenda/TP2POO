package com.example.tp2poo;

import java.sql.Date;

public class Telephone extends Appareil{
    private String connectivite;
    private String sim;
    //CONSTRUCTEUR
    public Telephone(String se, String marque, Date dachat,String modele, String ecran, String id, String couleur, String connectivite, String sim) {
        super(se, marque, modele, ecran, id, couleur, dachat);
        this.connectivite=connectivite;
        this.sim=sim;
    }
    //GETTERS
    public String getConnectivite() {
        return connectivite;
    }
    public String getSim() {
        return sim;
    }
    //SETTERS
    public void setConnectivite(String connectivite) {
        this.connectivite = connectivite;
    }
    public void setSim(String sim) {
        this.sim = sim;
    }
}
