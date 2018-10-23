package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class BicepExercise extends ArmExercise {
    public BicepExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.BICEPS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public BicepExercise createFromParcel(Parcel parcel) {
            return new BicepExercise(parcel);
        }

        @Override
        public BicepExercise[] newArray(int i) {
            return new BicepExercise[i];
        }
    };


    public BicepExercise(Parcel parcel) {
        super(parcel);
    }


}
