package com.polytech;

import com.polytech.tp.CoursDecorator;
import com.polytech.tp.ICours;

public class CoursEnAnglais  extends CoursDecorator{
      public CoursEnAnglais(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En anglais)";
    }

     @Override
    public double getDuree() {
          return coursDecorated.getDuree();
    
    };
}
