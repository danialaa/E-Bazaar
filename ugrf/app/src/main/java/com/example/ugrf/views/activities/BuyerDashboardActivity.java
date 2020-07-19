package com.example.ugrf.views.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ugrf.R;

public class BuyerDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_dashboard);
    }

    public void logout(View view) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(BuyerDashboardActivity.this);
        alertDialog.setTitle(getString(R.string.logout_dialog_title));
        alertDialog.setMessage(getString(R.string.logout_dialog_message));
        alertDialog.setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(BuyerDashboardActivity.this, LoginActivity.class));
            }
        });
        alertDialog.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });

        AlertDialog dialog = alertDialog.create();
        dialog.show();
    }

    public void goToProfile(View view) {
        startActivity(new Intent(BuyerDashboardActivity.this, ProfileActivity.class));
    }

    public void goToMarket(View view) {
        startActivity(new Intent(BuyerDashboardActivity.this, MarketShopsActivity.class));
    }

    public void goToHistory(View view) {
    }

    public void goToNotifications(View view) {
    }
}
