package com.example.sande.workoutplanner.Model;

import android.os.Parcel;

public abstract class LegExercise extends Exercise {
    public LegExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
    }
    public LegExercise(Parcel parcel) {
        super(parcel);
    }
}
