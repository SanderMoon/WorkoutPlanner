package com.example.sande.workoutplanner.Model;

import java.util.ArrayList;

public class ExerciseCollection{
    private ArrayList<Exercise> collection;

    public ExerciseCollection(){
        collection = new ArrayList<>();
        collection.add(new ChestExercise("Barbell benchpress", Tag.FRONTDELTS, Tag.TRICEPS));
        collection.add(new ChestExercise("Barbell incline benchpress", Tag.FRONTDELTS, Tag.TRICEPS));
        collection.add(new ChestExercise("Cable fly"));
        collection.add(new HamstringExercise("Deadlift", Tag.LOWERBACK));
        collection.add(new HamstringExercise("Hamstring curls"));
        collection.add(new QuadExercise("Leg extension"));
        collection.add(new QuadExercise("Low bar squats", Tag.GLUTES));
        collection.add(new QuadExercise("Lunges", Tag.GLUTES));
        collection.add(new FrontDeltExercise("Overhead press", Tag.TRICEPS));
        collection.add(new FrontDeltExercise("Arnold press", Tag.TRICEPS));
        collection.add(new RearSideDeltExercise("Vertical rows"));
        collection.add(new TricepExercise("Overhead triceps extension"));
        collection.add(new TricepExercise("Close grip benchpress", Tag.CHEST, Tag.FRONTDELTS));
        collection.add(new BicepExercise("Ez-bar curls"));
        collection.add(new BicepExercise("Hammer curls"));
        collection.add(new UpperBackExercise("Lat pulldowns", Tag.BICEPS));
        collection.add(new UpperBackExercise("Barbell shrugs", Tag.SIDEREARDELTS));
        collection.add(new MiddleBackExercise("Seated rows"));
        collection.add(new MiddleBackExercise("Barbell rows", Tag.BICEPS));
        collection.add(new LowerBackExercise("Back extensions"));
        collection.add(new GluteExercise("Glute bridges"));
        collection.add(new AbdominalCoreExercise("Ab wheel rollouts"));
        collection.add(new ObliqueCoreExercise("Wood choppers", Tag.ABDOMINALS));





    }

    public void add(Exercise exercise){
        collection.add(exercise);
    }

    public ArrayList<Exercise> getCollection(){
        return collection;
    }





}
