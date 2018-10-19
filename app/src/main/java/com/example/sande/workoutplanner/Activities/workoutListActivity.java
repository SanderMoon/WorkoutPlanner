package com.example.sande.workoutplanner.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sande.workoutplanner.Adapters.WorkoutListAdapter;
import com.example.sande.workoutplanner.MainActivity;
import com.example.sande.workoutplanner.Model.ChestExercise;
import com.example.sande.workoutplanner.Model.Exercise;
import com.example.sande.workoutplanner.Model.Tag;
import com.example.sande.workoutplanner.Model.Workout;
import com.example.sande.workoutplanner.Model.WorkoutExercise;
import com.example.sande.workoutplanner.R;

import java.util.ArrayList;

public class workoutListActivity extends AppCompatActivity {

    private WorkoutListAdapter customAdapter;
    ArrayList<Workout> workouts;
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_list_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.workoutListView);

        workouts = new ArrayList<>();

        customAdapter = new WorkoutListAdapter(workouts, getApplicationContext());

        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Workout dataModel= workouts.get(position);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.listview_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.new_string:
                addWorkout();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addWorkout() {

        startActivity(new Intent(workoutListActivity.this, MainActivity.class));

        Exercise chestExercise =  new ChestExercise("Barbell benchpress",Tag.TRICEPS);
        WorkoutExercise workoutExercise = new WorkoutExercise(chestExercise,80.0,4,5);
        workouts.add(new Workout("Push workout", workoutExercise));
        customAdapter.notifyDataSetChanged();
    }
}
