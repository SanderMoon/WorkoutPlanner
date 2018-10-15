package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

public class TricepExercise extends ArmExercise {
    public TricepExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.TRICEPS;
    }

}
