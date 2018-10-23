package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class AbdominalCoreExercise extends CoreExercise {
    public AbdominalCoreExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.ABDOMINALS;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public AbdominalCoreExercise createFromParcel(Parcel parcel) {
            return new AbdominalCoreExercise(parcel);
        }

        @Override
        public AbdominalCoreExercise[] newArray(int i) {
            return new AbdominalCoreExercise[i];
        }
    };


    public AbdominalCoreExercise(Parcel parcel) {
        super(parcel);
    }
}
