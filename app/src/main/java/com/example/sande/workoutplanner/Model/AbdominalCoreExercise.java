package com.example.sande.workoutplanner.Model;

public class AbdominalCoreExercise extends CoreExercise {
    public AbdominalCoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.ABDOMINALS;
    }
}
