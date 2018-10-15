package com.example.sande.workoutplanner.Model;

public class WorkoutExercise {


    private final Exercise exercise;
    private final double weight;
    private final int sets;
    private final int reps;

    public WorkoutExercise(Exercise exercise, double weight, int sets, int reps){
        this.exercise  = exercise;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
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






}
