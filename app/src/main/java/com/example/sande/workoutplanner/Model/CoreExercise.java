package com.example.sande.workoutplanner.Model;

import android.os.Parcel;

public abstract class CoreExercise extends Exercise {
    public CoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
    }
    public CoreExercise(Parcel parcel) {
        super(parcel);
    }
}
