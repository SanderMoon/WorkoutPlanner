package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class ObliqueCoreExercise extends CoreExercise {
    public ObliqueCoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.OBLIQUES;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public ObliqueCoreExercise createFromParcel(Parcel parcel) {
            return new ObliqueCoreExercise(parcel);
        }

        @Override
        public ObliqueCoreExercise[] newArray(int i) {
            return new ObliqueCoreExercise[i];
        }
    };


    public ObliqueCoreExercise(Parcel parcel) {
        super(parcel);
    }
}
