package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class ChestExercise extends Exercise {


    public ChestExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.CHEST;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public ChestExercise createFromParcel(Parcel parcel) {
            return new ChestExercise(parcel);
        }

        @Override
        public ChestExercise[] newArray(int i) {
            return new ChestExercise[i];
        }
    };


    public ChestExercise(Parcel parcel) {
        super(parcel);
    }
}
