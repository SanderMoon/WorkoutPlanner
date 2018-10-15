package com.example.sande.workoutplanner.Model;

public abstract class CoreExercise extends Exercise {
    public CoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
    }
}
