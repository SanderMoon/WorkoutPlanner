package com.example.sande.workoutplanner.Model;

import android.os.Parcel;

public abstract class BackExercise extends Exercise {
    public BackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
    }

    public BackExercise(Parcel parcel) {
        super(parcel);
    }
}
