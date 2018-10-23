package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class ArmExercise extends Exercise {
    public ArmExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);

    }

    public ArmExercise(Parcel parcel) {
        super(parcel);
    }




}
