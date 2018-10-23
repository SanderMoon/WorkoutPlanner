package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class RearSideDeltExercise extends DeltoidExercise {
    public RearSideDeltExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.SIDEREARDELTS;
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public RearSideDeltExercise createFromParcel(Parcel parcel) {
            return new RearSideDeltExercise(parcel);
        }

        @Override
        public RearSideDeltExercise[] newArray(int i) {
            return new RearSideDeltExercise[i];
        }
    };


    public RearSideDeltExercise(Parcel parcel) {
        super(parcel);
    }
}
