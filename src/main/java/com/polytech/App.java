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
       ICours coursBase = new CoursBuilder()
        .setMatiere("Génie Logiciel")
        .setEnseignant("Mme Manel")
        .setSalle("B203")
        .build();

// Empiler plusieurs décorateurs
ICours coursEnLigne = new CoursEnLigne(coursBase);
ICours coursEnLigneAnglais = new CoursEnAnglais(coursEnLigne);
ICours coursMagistral = new CoursMagistral(coursEnLigneAnglais);

System.out.println(coursMagistral.getDescription());
    }
}
