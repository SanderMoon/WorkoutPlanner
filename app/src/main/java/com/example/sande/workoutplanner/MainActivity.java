package com.example.sande.workoutplanner;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sande.workoutplanner.Model.Exercise;
import com.example.sande.workoutplanner.Model.ExerciseCollection;

/**
 *
 *  Deze activity moeten we later omzetten in een non-main activity omdat dit alleen de activity
 *  is die gebruikt wordt wanneer je exercises moet toevoegen aan je workouts.
 *  We moeten namelijk hierna Workout objecten gaan maken met exercises er in.
 *  Waarschijnlijk deleten we dan ook de weight/reps/sets uit de weergave van de exercises in de lijst
 *  iig een goede oefening dit.
 *
 */



public class MainActivity extends AppCompatActivity {

    ArrayAdapter<Exercise> sAdapter;
    private String m_Text = "";
    private double m_Weight;
    private int m_sets;
    private int m_reps;

    ExerciseCollection collectionWrapper;
    private View view;
    private int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar();
        setContentView(R.layout.activity_main);
        collectionWrapper = new ExerciseCollection();
        sAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, collectionWrapper.getCollection());
        ListView listview = findViewById(R.id.listview);
        listview.setAdapter(sAdapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                addString();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addString() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Exercise");

        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.grid_layout, null);
        builder.setView(view);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                EditText nameInput = view.findViewById(R.id.name_editText);
                EditText weightInput = view.findViewById(R.id.weight_editText);
                EditText setsInput = view.findViewById(R.id.sets_editText);
                EditText repsInput = view.findViewById(R.id.reps_editText);

                EditText[] inputs = {nameInput, weightInput, setsInput, repsInput};

                if(EditTextEmptyCheck(weightInput)){
                    m_Weight = 0.0;
                } else{
                    m_Weight = Double.valueOf(weightInput.getText().toString());
                }

                if(EditTextEmptyCheck(repsInput)){
                    m_reps = 0;
                } else{
                    m_reps = Integer.valueOf(repsInput.getText().toString());
                }

                if(EditTextEmptyCheck(setsInput)){
                    m_sets = 0;
                } else{
                    m_sets = Integer.valueOf(setsInput.getText().toString());
                }
                if(EditTextEmptyCheck(nameInput)){
                    m_Text = "Exercise " + index;
                    index++;
                } else{
                    m_Text = nameInput.getText().toString();
                }


                sAdapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        //builder.show();


    }

    private boolean EditTextEmptyCheck(EditText etText) {
        return etText.getText().toString().trim().length() <= 0;
    }

}
