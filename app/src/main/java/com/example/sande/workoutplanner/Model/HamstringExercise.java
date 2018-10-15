package com.example.sande.workoutplanner.Model;

public class HamstringExercise extends LegExercise {
    public HamstringExercise(String name, Tag... secondaryTags) {
        super(name, secondaryTags);
        mainTag = Tag.HAMSTRINGS;
    }

}
