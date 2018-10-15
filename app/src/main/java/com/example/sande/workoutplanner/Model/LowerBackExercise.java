package com.example.sande.workoutplanner.Model;

public class LowerBackExercise extends BackExercise {
    public LowerBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.LOWERBACK;
    }
}
