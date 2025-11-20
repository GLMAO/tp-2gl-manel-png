package com.polytech;

import com.polytech.tp.CoursBuilder;
import com.polytech.tp.CoursEnLigne;
import com.polytech.tp.Etudiant;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.ICours;
import com.polytech.tp.Responsable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        Etudiant etu1 = new Etudiant("Amina");
        Etudiant etu2 = new Etudiant("ines");
        Responsable resp = new Responsable("Dr. Dupont");

        // Attacher les observateurs
        gestionnaire.attach(etu1);
        gestionnaire.attach(etu2);
        gestionnaire.attach(resp);

        // Créer un cours
        ICours cours = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Mme Manel")
                .setSalle("B101")
                .build();

        // Ajouter, modifier, notifier
        gestionnaire.ajouterCours(cours);
        gestionnaire.modifierCours(cours, "Changement de salle");
        gestionnaire.setChangement("Vacances déplacées");
    }
}
