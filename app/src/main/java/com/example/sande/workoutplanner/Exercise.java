package com.example.sande.workoutplanner;

import android.support.annotation.NonNull;

public class Exercise {

    private final String name;
    private final int reps;
    private final double weight;
    private final int sets;

    public Exercise(String name, double weight, int sets, int reps){
        this.name = name;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
