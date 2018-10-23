package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class LowerBackExercise extends BackExercise {
    public LowerBackExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.LOWERBACK;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public LowerBackExercise createFromParcel(Parcel parcel) {
            return new LowerBackExercise(parcel);
        }

        @Override
        public LowerBackExercise[] newArray(int i) {
            return new LowerBackExercise[i];
        }
    };


    public LowerBackExercise(Parcel parcel) {
        super(parcel);
    }
}
