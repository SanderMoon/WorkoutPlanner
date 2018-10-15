package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

public class UpperBackExercise extends BackExercise {
    public UpperBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.UPPERBACK;
    }

}
