package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class HamstringExercise extends LegExercise {
    public HamstringExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.HAMSTRINGS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public HamstringExercise createFromParcel(Parcel parcel) {
            return new HamstringExercise(parcel);
        }

        @Override
        public HamstringExercise[] newArray(int i) {
            return new HamstringExercise[i];
        }
    };


    public HamstringExercise(Parcel parcel) {
        super(parcel);
    }

}
