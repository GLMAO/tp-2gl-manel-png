package com.polytech;

import com.polytech.tp.CoursDecorator;
import com.polytech.tp.ICours;

public class CoursMagistral extends CoursDecorator{
    
      public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }
  @Override
    public double getDuree() {
          return coursDecorated.getDuree();
    
    };


}
