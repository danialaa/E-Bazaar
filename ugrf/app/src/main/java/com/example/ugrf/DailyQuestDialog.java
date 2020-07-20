package com.example.ugrf;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

public class DailyQuestDialog extends Dialog implements android.view.View.OnClickListener {
    public Activity activity;
    public Dialog dialog;
    public AppCompatImageButton cancel;
    public AppCompatButton collect;

    public DailyQuestDialog(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dailyquest_dialog);
        cancel = findViewById(R.id.cancelButton);
        collect = findViewById(R.id.collectButton);
        cancel.setOnClickListener(this);
        collect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelButton:
                activity.finish();

                break;

            case R.id.collectButton:


                break;
        }

        dismiss();
    }
}
