package com.domashevsky.mihail.gympilot.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.domashevsky.mihail.gympilot.R;
import com.domashevsky.mihail.gympilot.exercise.Exersize;

public class Workout extends AppCompatActivity {

    private Button addExercise;

    private void addExercise(){
        addExercise = findViewById(R.id.add_exercise);
        addExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addExerciseIntent = new Intent(Workout.this, Exersize.class);
                startActivity(addExerciseIntent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        addExercise();
    }
}
