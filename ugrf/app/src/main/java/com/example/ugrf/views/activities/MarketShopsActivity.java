package com.example.ugrf.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.example.ugrf.DailyQuestDialog;
import com.example.ugrf.R;

public class MarketShopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_shops);
    }

    public void backToDashboard(View view) {
        finish();
    }

    public void goToHomeware(View view) {
        startActivity(new Intent(MarketShopsActivity.this, ShopItemsActivity.class));
    }

    public void openQuests(View view) {
        DailyQuestDialog dialog = new DailyQuestDialog(MarketShopsActivity.this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
