package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

public class ChestExercise extends Exercise {
    public ChestExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.CHEST;
    }
}
