package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class TricepExercise extends ArmExercise {
    public TricepExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.TRICEPS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public TricepExercise createFromParcel(Parcel parcel) {
            return new TricepExercise(parcel);
        }

        @Override
        public TricepExercise[] newArray(int i) {
            return new TricepExercise[i];
        }
    };


    public TricepExercise(Parcel parcel) {
        super(parcel);
    }


}
