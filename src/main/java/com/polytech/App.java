package com.polytech;

import com.polytech.tp.CoursBuilder;
import com.polytech.tp.CoursEnLigne;
import com.polytech.tp.ICours;

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

ICours coursEnLigne = new CoursEnLigne(coursBase);

System.out.println(coursEnLigne.getDescription());
    }
}
