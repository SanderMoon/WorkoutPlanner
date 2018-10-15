package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Exercise {

    protected String name;
    protected Tag mainTag;
    private final ArrayList<Tag> secondaryTagList = new ArrayList<Tag>();

    public Exercise(String name, Tag... secondaryTags){
        this.name = name;
        secondaryTagList.addAll(Arrays.asList(secondaryTags));
    }

    @NonNull
    @Override
    public String toString(){
        return name;
    }

    public void addSecondaryTag(Tag t){
        secondaryTagList.add(t);
    }

    public void deleteSecondatyTag(Tag t){
        secondaryTagList.remove(t);
    }
}