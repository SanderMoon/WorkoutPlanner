package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class MiddleBackExercise extends BackExercise {
    public MiddleBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.MIDDLEBACK;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public MiddleBackExercise createFromParcel(Parcel parcel) {
            return new MiddleBackExercise(parcel);
        }

        @Override
        public MiddleBackExercise[] newArray(int i) {
            return new MiddleBackExercise[i];
        }
    };


    public MiddleBackExercise(Parcel parcel) {
        super(parcel);
    }

}
