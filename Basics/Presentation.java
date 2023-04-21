package com.rtit.esilv.bin1.esilv.basics;

public class Presentation {
    //Attributs
    private String auteurs;
    private String titreArticle;
    private int mois;
    private int jour;
    private String heure;
    
    //Constructeur
    public Presentation(String auteurs, String titreArticle, int mois, int jour, String heure) {
        this.auteurs = auteurs;
        this.titreArticle = titreArticle;
        this.mois = mois;
        this.jour = jour;
        this.heure = heure;
    }
    
    // Retourner une chaine comme l'exemple ci-dessous :
    //"Présentation de l'article "User modeling" par Taha Ridene à 10 heures"
    public String toString() {
        return "Présentation de l'article \"" + titreArticle + "\" par " + auteurs + " à " + heure;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }   
}
