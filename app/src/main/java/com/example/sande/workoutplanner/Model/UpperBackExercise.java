package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class UpperBackExercise extends BackExercise {
    public UpperBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.UPPERBACK;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public UpperBackExercise createFromParcel(Parcel parcel) {
            return new UpperBackExercise(parcel);
        }

        @Override
        public UpperBackExercise[] newArray(int i) {
            return new UpperBackExercise[i];
        }
    };


    public UpperBackExercise(Parcel parcel) {
        super(parcel);
    }

}
