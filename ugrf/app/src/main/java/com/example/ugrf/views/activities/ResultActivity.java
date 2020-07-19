package com.example.ugrf.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.ugrf.R;

public class ResultActivity extends AppCompatActivity {
    private AppCompatTextView tempText, nasueaText, throatText, pressureText, heartbeatText, smellText, tasteText, coughText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tempText = findViewById(R.id.temperatureText);
        nasueaText = findViewById(R.id.nauseaText);
        throatText = findViewById(R.id.throatText);
        pressureText = findViewById(R.id.pressureText);
        heartbeatText = findViewById(R.id.heartbeatText);
        smellText = findViewById(R.id.smellText);
        tasteText = findViewById(R.id.tasteText);
        coughText = findViewById(R.id.coughText);

        tempText.setText(getIntent().getExtras().getString("temperature"));
        nasueaText.setText(getIntent().getExtras().getString("nausea"));
        throatText.setText(getIntent().getExtras().getString("throat"));
        pressureText.setText(getIntent().getExtras().getString("pressure"));
        heartbeatText.setText(getIntent().getExtras().getString("heartbeat"));
        smellText.setText(getIntent().getExtras().getString("smell"));
        tasteText.setText(getIntent().getExtras().getString("taste"));
        coughText.setText(getIntent().getExtras().getString("cough"));
    }

    public void doneCheckup(View view) {
        startActivity(new Intent(ResultActivity.this, BuyerDashboardActivity.class));
    }
}
