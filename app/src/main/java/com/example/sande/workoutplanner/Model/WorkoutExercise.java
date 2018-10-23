package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class WorkoutExercise implements Parcelable {


    Exercise exercise;
    private final double weight;
    private final int sets;
    private final int reps;

    public WorkoutExercise(Exercise exercise, double weight, int sets, int reps){
        this.exercise  = exercise;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }

    public WorkoutExercise(Parcel parcel) {
        this.exercise = parcel.readParcelable(exercise.getClass().getClassLoader());
        this.sets = parcel.readInt();
        this.reps = parcel.readInt();
        this.weight = parcel.readDouble();

    }

    public Exercise getExercise() {
        return exercise;
    }

    public double getWeight() {
        return weight;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int[] repsetsArray = new int[]{this.sets, this.reps};
        parcel.writeInt(this.sets);
        parcel.writeInt(this.reps);
        parcel.writeDouble(this.weight);
        parcel.writeParcelable(this.exercise, i);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){

        @Override
        public WorkoutExercise createFromParcel(Parcel parcel) {
            return new WorkoutExercise(parcel);
        }

        @Override
        public WorkoutExercise[] newArray(int i) {
            return new WorkoutExercise[i];
        }
    };
}
