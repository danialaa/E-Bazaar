package com.example.ugrf.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.ugrf.R;

public class NewItemActivity extends AppCompatActivity {
    private AppCompatEditText tempEdit, pressureEdit, heartbeatEdit;
    private AppCompatCheckBox coughCheckbox, throatCheckbox, nauseaCheckbox, tasteCheckbox, smellCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);

        tempEdit = findViewById(R.id.temperatureEdit);
        pressureEdit = findViewById(R.id.pressureEdit);
        heartbeatEdit = findViewById(R.id.heartbeatEdit);
        coughCheckbox = findViewById(R.id.coughCheckbox);
        throatCheckbox = findViewById(R.id.throatPainCheckbox);
        nauseaCheckbox = findViewById(R.id.nauseaCheckbox);
        tasteCheckbox = findViewById(R.id.tasteCheckbox);
        smellCheckbox = findViewById(R.id.smellCheckbox);
    }

    public void backToHome(View view) {
        finish();
    }

    public void submitCheckup(View view) {
        Intent intent = new Intent(NewItemActivity.this, ResultActivity.class);
        intent.putExtra("temperature", tempEdit.getText().toString());
        intent.putExtra("pressure", pressureEdit.getText().toString());
        intent.putExtra("heartbeat", heartbeatEdit.getText().toString());
        intent.putExtra("cough", String.valueOf(coughCheckbox.isChecked()));
        intent.putExtra("throat", String.valueOf(throatCheckbox.isChecked()));
        intent.putExtra("nausea", String.valueOf(nauseaCheckbox.isChecked()));
        intent.putExtra("taste", String.valueOf(tasteCheckbox.isChecked()));
        intent.putExtra("smell", String.valueOf(smellCheckbox.isChecked()));
        startActivity(intent);
    }
}
