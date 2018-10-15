package com.example.sande.workoutplanner.Model;

public class QuadExercise extends LegExercise {
    public QuadExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.QUADS;
    }
}
