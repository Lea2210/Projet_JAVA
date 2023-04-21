package com.rtit.esilv.bin1.esilv.test;
import com.rtit.esilv.bin1.esilv.basics.*;
import com.rtit.esilv.bin1.poo.utils.Saisie;

public class TestConference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Conference conf = new Conference("CIRA", "BERLIN", 2022);
        ConferenceOnline confOnline = new ConferenceOnline(123456789, conf);
        int nbrSess = Saisie.lireEntier("Donnez le nombre de sessions : ");
        if(nbrSess<=0) {
            do{
                nbrSess = Saisie.lireEntier("Le nombre rentré n'est pas bon, veuillez donnez un entier supérieur à 0 : ");// Saisie au clavier faire du blindage
            }while (nbrSess<=0); 
        }
            
        
        for (int i = 0; i< nbrSess ; i++)
        {
            String thematique = Saisie.lireChaine("Donnez la thématique de la session : ");// Saisie au clavier
            int jour = Saisie.lireEntier("Donnez le jour : "); // Saisie au clavier
            int mois = Saisie.lireEntier("Donnez le mois : ");// Saisie au clavier
            Session s = new Session(thematique, jour, mois);
            
            int nbrPres = Saisie.lireEntier("Donnez le nombre de présentation : ");// Saisie au clavier faire du blindage
            if(nbrPres<=0) {
                do{
                    nbrPres = Saisie.lireEntier("Le nombre rentré n'est pas bon, veuillez donnez un entier supérieur à 0 : ");// Saisie au clavier faire du blindage
                }while (nbrPres<=0); 
            }
                
            for(int j = 0; j< nbrPres; j++){
                String titreArticle = Saisie.lireChaine("Donnez le titre de l'Article : "); // Saisie au clavier
                String auteurs = Saisie.lireChaine("Donnez le nom de l'auteur : ");// Saisie au clavier
                Presentation p = new Presentation(auteurs, titreArticle,mois,jour,""+(j+8)+ " heures" );
                s.addPresentation(p);
            }
            conf.addSession(s);
        }
        /** Affichage */
        System.out.print(conf.toString());
        System.out.println(confOnline.toString());
    }
}
