package com.example.sande.workoutplanner.Model;

public class MiddleBackExercise extends BackExercise {
    public MiddleBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.MIDDLEBACK;
    }
}
