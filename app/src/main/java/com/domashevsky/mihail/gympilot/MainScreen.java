package com.domashevsky.mihail.gympilot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.domashevsky.mihail.gympilot.meal.Meal;
import com.domashevsky.mihail.gympilot.water.Water;
import com.domashevsky.mihail.gympilot.workout.Workout;

public class MainScreen extends AppCompatActivity {

    private Button workout;
    private Button water;
    private Button meal;

    private void workout(){
        workout = findViewById(R.id.workout);
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goWorkout = new Intent(MainScreen.this, Workout.class);
                startActivity(goWorkout);
            }
        });
    }

    private void water(){
        water = findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goWater = new Intent(MainScreen.this, Water.class);
                startActivity(goWater);
            }
        });
    }

    private void meal(){
        meal = findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMeal = new Intent(MainScreen.this, Meal.class);
                startActivity(goMeal);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        workout();
        water();
        meal();
    }
}
