package com.example.ugrf.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ugrf.R;

public class NewItemDetailsActivity extends AppCompatActivity {
    private AppCompatSpinner categorySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item_details);

        categorySpinner = findViewById(R.id.categorySpinner);
    }

    public void backToHome(View view) {
    }

    public void publish(View view) {
        startActivity(new Intent(NewItemDetailsActivity.this, SellerDashboardActivity.class));
    }
}
