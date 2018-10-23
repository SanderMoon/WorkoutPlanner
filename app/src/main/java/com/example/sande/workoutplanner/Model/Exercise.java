package com.example.sande.workoutplanner.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Exercise implements Parcelable {

    protected String name;
    protected Tag mainTag;
    private ArrayList<Tag> secondaryTagList;

    public Exercise(String name, Tag... secondaryTags){
        this.name = name;
        this.secondaryTagList = new ArrayList<>();
        secondaryTagList.addAll(Arrays.asList(secondaryTags));
    }

    protected Exercise(Parcel in){
        name = in.readString();
        ArrayList<String> tagStrings = new ArrayList<>();
        in.readList(tagStrings, null);
        for(String t  : tagStrings){
            secondaryTagList.add(Tag.valueOf(t));
        }

    }

    @NonNull
    @Override
    public String toString(){
        return name;
    }

    public void addSecondaryTag(Tag t){
        secondaryTagList.add(t);
    }

    public void deleteSecondaryTag(Tag t){
        secondaryTagList.remove(t);
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(this.mainTag.name());
        ArrayList<String> tagStrings = new ArrayList<>();
        for(Tag t : secondaryTagList){
            tagStrings.add(t.name());
        }
        parcel.writeList(tagStrings);
    }



}