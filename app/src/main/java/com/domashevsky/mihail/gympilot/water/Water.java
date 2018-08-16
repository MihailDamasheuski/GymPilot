package com.domashevsky.mihail.gympilot.water;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.domashevsky.mihail.gympilot.R;

import java.util.ArrayList;

import utils.DateUtils;

public class Water extends AppCompatActivity {

    private static final int ADD_WATER_REQUEST_CODE = 0;

    private Button addWater;
    private ListView listView;
    private ArrayList<String> waterItems;
    private ArrayAdapter<String> waterItemArrayAdapter;

    private void addWater(){
        addWater = findViewById(R.id.add_water);
        addWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addWaterIntent = new Intent(Water.this, AddWater.class);
                startActivityForResult(addWaterIntent, ADD_WATER_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        waterItems = new ArrayList<>();
        waterItemArrayAdapter = new ArrayAdapter<>(Water.this,
                android.R.layout.simple_list_item_1, waterItems);
        listView = findViewById(R.id.water_today);
        listView.setAdapter(waterItemArrayAdapter);
        addWater();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ADD_WATER_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String waterAmount = data.getStringExtra(Intent.EXTRA_TEXT);
                WaterItem waterItem = new WaterItem(waterAmount, DateUtils.getCurrentDate());
                waterItems.add(waterItem.getAmount() + " ml at " + waterItem.getDate());
                waterItemArrayAdapter.notifyDataSetChanged();
            }
        }
    }
}
