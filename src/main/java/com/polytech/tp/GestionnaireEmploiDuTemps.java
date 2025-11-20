package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps   implements Subject  {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private String Changement;


     @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : new ArrayList<>(observers)) {
            o.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
         String message = "Nouveau cours ajouté : " + cours.getDescription();
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
         System.out.println(message);
        notifyObservers(message); 
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
           notifyObservers(message); 
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        this.Changement=string;
        String message = "Changement emploi du temps : " +string ;
        System.out.println(message);
        notifyObservers(Changement);
    } 
}