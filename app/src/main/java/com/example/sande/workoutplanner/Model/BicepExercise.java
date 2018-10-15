package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

public class BicepExercise extends ArmExercise {
    public BicepExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.BICEPS;
    }

}
