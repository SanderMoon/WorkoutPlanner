package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class GluteExercise extends LegExercise {
    public GluteExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.GLUTES;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public GluteExercise createFromParcel(Parcel parcel) {
            return new GluteExercise(parcel);
        }

        @Override
        public GluteExercise[] newArray(int i) {
            return new GluteExercise[i];
        }
    };


    public GluteExercise(Parcel parcel) {
        super(parcel);
    }
}
