package com.example.sande.workoutplanner.Model;

public class RearSideDeltExercise extends DeltoidExercise {
    public RearSideDeltExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.SIDEREARDELTS;
    }
}
