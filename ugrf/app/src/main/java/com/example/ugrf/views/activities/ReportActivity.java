package com.example.ugrf.views.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.ugrf.R;

public class ReportActivity extends AppCompatActivity {
    private AppCompatTextView reportTitle;
    //private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        //reportTitle = findViewById(R.id.reportTitleText);
        //recyclerView = findViewById(R.id.reportRecycler);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setHasFixedSize(true);
    }

    public void backToHome(View view) {
    }
}
