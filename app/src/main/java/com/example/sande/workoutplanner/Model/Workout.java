package com.example.sande.workoutplanner.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Workout {


    private ArrayList<WorkoutExercise> workoutExercisesList;
    private String title;


    public Workout(String title, WorkoutExercise... workoutExercises){
        workoutExercisesList = new ArrayList<>();
        workoutExercisesList.addAll(Arrays.asList(workoutExercises));
        this.title  = title;

    }

    public ArrayList<WorkoutExercise> getWorkoutExercises() {
        return workoutExercisesList;
    }

    public void addExercise(WorkoutExercise exercise){
        workoutExercisesList.add(exercise);
    }

    public String getTitle(){
        return title;

    }

    public int getNrExercises(){
        return workoutExercisesList.size();
    }

}
