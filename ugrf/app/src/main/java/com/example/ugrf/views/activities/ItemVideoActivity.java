package com.example.ugrf.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ugrf.R;

public class ItemVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_video);
    }

    public void goToDetails(View view) {
        startActivity(new Intent(ItemVideoActivity.this, NewItemDetailsActivity.class));
    }
}
