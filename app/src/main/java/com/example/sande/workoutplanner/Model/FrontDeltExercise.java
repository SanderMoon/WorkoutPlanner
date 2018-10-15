package com.example.sande.workoutplanner.Model;

public class FrontDeltExercise extends DeltoidExercise {
    public FrontDeltExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.FRONTDELTS;
    }
}
