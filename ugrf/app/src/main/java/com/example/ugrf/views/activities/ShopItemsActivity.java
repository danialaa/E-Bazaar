package com.example.ugrf.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ugrf.R;

public class ShopItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_items);
    }

    public void goToARView(View view) {
        startActivity(new Intent(ShopItemsActivity.this, ARActivity.class));
    }
}
