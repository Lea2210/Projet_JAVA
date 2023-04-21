package com.rtit.esilv.bin1.esilv.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.util.StringUtils;
import com.rtit.bin1.poo.gestionannuaire.basics.Employe;
import com.rtit.esilv.bin1.esilv.basics.*;
import com.rtit.esilv.bin1.poo.utils.DBAction;

public class ConferenceDAO {
    
    /**
     * Ajouter une conférence
     * 
     * @param 
     * @return : la conférence à bien été ajouté à la db sinon code erreur
     */
    public static String addConference(Conference conference, Session session,Presentation presentation) {
        DBAction.DBConnexion();
        String query = "";
        String str="";
        try {
            query = "insert into conference (nom,lieu,date,specialite,auteurs,articles) values ('" 
                    + conference.getNom() + "','" + conference.getLieu() + "','" 
                    + conference.getAnnee() + "-"+session.getMois()+"-"+session.getJour()+"','"+session.getSpecialite()+"','"
                    + presentation.getAuteurs()+"','"+presentation.getTitreArticle()+"')";
            DBAction.getStm().executeUpdate(query);
            str = "La ligne a bien été insérée";
        } catch (Exception e) {
            str = "Erreur lors de l'exécution de la requête : " + query;
            e.printStackTrace();
        }
        DBAction.DBClose();
        return str;
    }
    
    public static String deleteConference(String nom, String lieu) {
        DBAction.DBConnexion();
        String query = "delete from conference where nom = '"+nom+"' and lieu = '"+lieu;
        String str = "";
        try {
            DBAction.getStm().executeUpdate(query);
            str = "La ligne à bien été supprimée";
        }catch (Exception e) {
            str = "Erreur lors de l'exécution de la requête : " + query;
            e.printStackTrace();
        }
        DBAction.DBClose();
        return str;
    }
    
    public static ArrayList<Conference> getAllEmploye() throws SQLException {
        //TO DO
                DBAction.DBConnexion();
                ArrayList<Conference> conference = new ArrayList<>();
                ResultSet res = null;
                try {
                    res = DBAction.getStm().executeQuery("select * from conference"); //nom,lieu,date,specialite,auteurs,articles
                    
                    while (res.next()) {
                        String nom = res.getString("nom");
                        String lieu = res.getString("adresse");
                        String date = res.getString("telephone");
                        //date = StringUtils.substring(date, 0, 4);
                        String specialite = res.getString("salaire");
                        String auteurs = res.getString("auteurs");
                        String articles = res.getString("articles");
                        // Conference conference = new Conference(nom,lieu,date);  a completer 
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                DBAction.DBClose();
                return conference;
            }
    
}


