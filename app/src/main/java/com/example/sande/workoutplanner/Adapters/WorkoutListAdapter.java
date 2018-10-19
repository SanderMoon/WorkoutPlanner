package com.example.sande.workoutplanner.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.sande.workoutplanner.Model.Workout;
import com.example.sande.workoutplanner.R;

import java.util.ArrayList;

public class WorkoutListAdapter extends ArrayAdapter<Workout> implements View.OnClickListener {

    private ArrayList<Workout> data;
    private Context context;

    public WorkoutListAdapter(ArrayList<Workout> data, Context context ){
        super(context, R.layout.workout_row_item, data);
        this.data = data;
        this.context = context;

    }

    @Override
    public void onClick(View v) {

    }

    private static class ViewHolder {
        TextView workoutTitle;
        TextView exerciseNr;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Workout workout = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.workout_row_item, parent, false);
            viewHolder.workoutTitle =convertView.findViewById(R.id.workoutTitle);
            viewHolder.exerciseNr = convertView.findViewById(R.id.nr_of_exercises);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.workoutTitle.setText(workout.getTitle());
        viewHolder.exerciseNr.setText("Contains " + String.valueOf(workout.getNrExercises()) + " exercise(s)");
        // Return the completed view to render on screen
        return convertView;

    }


}
