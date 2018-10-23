package com.example.sande.workoutplanner.Model;

import android.os.Parcel;

public abstract class DeltoidExercise extends Exercise {
    public DeltoidExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);

    }
    public DeltoidExercise(Parcel parcel) {
        super(parcel);
    }


}
