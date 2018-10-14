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

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<Exercise> sAdapter;
    private String m_Text = "";
    private double m_Weight;
    private int m_sets;
    private int m_reps;
    ExerciseCollection collectionWrapper;
    private View view;


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

                m_Text = nameInput.getText().toString();
                m_Weight = Double.valueOf(weightInput.getText().toString());
                m_sets = Integer.valueOf(setsInput.getText().toString());
                m_reps = Integer.valueOf(repsInput.getText().toString());
                collectionWrapper.add(new Exercise(m_Text,m_Weight,m_sets,m_reps));
                sAdapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();


    }

}
