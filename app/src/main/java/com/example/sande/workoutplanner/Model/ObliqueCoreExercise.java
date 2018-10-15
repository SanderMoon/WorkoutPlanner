package com.example.sande.workoutplanner.Model;

public class ObliqueCoreExercise extends CoreExercise {
    public ObliqueCoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.OBLIQUES;
    }
}
