package com.example.ugrf.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.ugrf.R;
import com.google.ar.core.ArCoreApk;

public class ShopItemsActivity extends AppCompatActivity {
    private AppCompatImageView itemImage;
    private AppCompatImageButton arButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_items);

        itemImage = findViewById(R.id.itemImage);
        arButton = findViewById(R.id.arButton);

        canEnableAR();
    }

    private void canEnableAR() {
        ArCoreApk.Availability availability = ArCoreApk.getInstance().checkAvailability(this);

        if (availability.isTransient()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    canEnableAR();
                }
            }, 200);
        } else if (availability.isSupported()) {
            itemImage.setVisibility(View.VISIBLE);
            arButton.setVisibility(View.VISIBLE);
            arButton.setEnabled(true);
        } else {
            arButton.setVisibility(View.INVISIBLE);
            arButton.setEnabled(false);
        }
    }

    public void goToARView(View view) {
        startActivity(new Intent(ShopItemsActivity.this, ARActivity.class));
    }
}
