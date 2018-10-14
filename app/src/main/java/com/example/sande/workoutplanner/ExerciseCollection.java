package com.example.sande.workoutplanner;

import java.util.ArrayList;

public class ExerciseCollection{
    private ArrayList<Exercise> collection;

    public ExerciseCollection(){
        collection = new ArrayList<Exercise>();
        collection.add(new Exercise("Deadlift", 150, 4, 5));
        collection.add(new Exercise("Squat", 110, 4, 5));
        collection.add(new Exercise("Benchpress", 95, 4, 5));
        collection.add(new Exercise("Split squats", 60, 3, 5));
        collection.add(new Exercise("Pulldowns", 70, 3, 5));
        collection.add(new Exercise("Barbell row", 85, 3, 5));
        collection.add(new Exercise("Incline benchpress", 90, 3, 5));

    }

    public void add(Exercise exercise){
        collection.add(exercise);
    }

    public ArrayList<Exercise> getCollection(){
        return collection;
    }





}
