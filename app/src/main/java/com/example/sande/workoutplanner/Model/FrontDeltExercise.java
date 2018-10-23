package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class FrontDeltExercise extends DeltoidExercise {
    public FrontDeltExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.FRONTDELTS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public FrontDeltExercise createFromParcel(Parcel parcel) {
            return new FrontDeltExercise(parcel);
        }

        @Override
        public FrontDeltExercise[] newArray(int i) {
            return new FrontDeltExercise[i];
        }
    };


    public FrontDeltExercise(Parcel parcel) {
        super(parcel);
    }
}
