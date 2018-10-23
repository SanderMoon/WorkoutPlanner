package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class QuadExercise extends LegExercise {
    public QuadExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.QUADS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public QuadExercise createFromParcel(Parcel parcel) {
            return new QuadExercise(parcel);
        }

        @Override
        public QuadExercise[] newArray(int i) {
            return new QuadExercise[i];
        }
    };


    public QuadExercise(Parcel parcel) {
        super(parcel);
    }
}
