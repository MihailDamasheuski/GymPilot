package com.domashevsky.mihail.gympilot.water;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.domashevsky.mihail.gympilot.R;

public class AddWater extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_water);
        button = findViewById(R.id.add_water_amount);
        editText = findViewById(R.id.add_water_edit_text);
        onClick();
    }

    private void onClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editTextValue = editText.getText().toString();
                Intent water = new Intent(AddWater.this, Water.class);
                water.putExtra(Intent.EXTRA_TEXT, editTextValue);
                setResult(RESULT_OK, water);
                finish();
            }
        });
    }

}
