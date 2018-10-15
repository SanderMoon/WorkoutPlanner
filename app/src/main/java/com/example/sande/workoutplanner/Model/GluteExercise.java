package com.example.sande.workoutplanner.Model;

public class GluteExercise extends LegExercise {
    public GluteExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.GLUTES;
    }
}
