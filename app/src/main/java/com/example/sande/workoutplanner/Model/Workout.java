package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;

public class Workout implements Parcelable {


    private ArrayList<WorkoutExercise> workoutExercisesList;
    private String title;


    public Workout(String title, WorkoutExercise... workoutExercises) {
        workoutExercisesList = new ArrayList<WorkoutExercise>();
        workoutExercisesList.addAll(Arrays.asList(workoutExercises));
        this.title = title;

    }

    public Workout(Parcel parcel) {
        this.title = parcel.readString();
        this.workoutExercisesList = parcel.readArrayList(Workout.class.getClassLoader());
    }

    public ArrayList<WorkoutExercise> getWorkoutExercises() {
        return workoutExercisesList;
    }

    public void addExercise(WorkoutExercise exercise) {
        workoutExercisesList.add(exercise);
    }

    public String getTitle() {
        return title;

    }

    public int getNrExercises() {
        return workoutExercisesList.size();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(workoutExercisesList);
        parcel.writeString(title);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public Object createFromParcel(Parcel parcel) {
            return new Workout(parcel);
        }

        @Override
        public Object[] newArray(int i) {
            return new Workout[i];
        }
    };


}
