package com.example.ugrf.views.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.ugrf.R;

import java.io.File;

public class ItemVideoActivity extends AppCompatActivity {
    public static int VIDEO_CAPTURED = 1;
    public VideoView vidView;
    public Uri vidUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_video);

        vidView = findViewById(R.id.sellerVideoView);
    }

    public void goToDetails(View view) {
        startActivity(new Intent(ItemVideoActivity.this, NewItemDetailsActivity.class));
    }

    public void captureVideo(View view) {
        Log.d("Video Activity", "Capturing video");

        Intent captureVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        setResult(Activity.RESULT_OK, captureVideoIntent);
        startActivityForResult(captureVideoIntent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 1) {
            VideoView videoView;
            vidUri = data.getData();
            ContentResolver contentResolver = getContentResolver();
            Cursor cursor = contentResolver.query(vidUri, null, null, null, null);

            if (cursor != null && cursor.moveToFirst()) {
                do {
                    String title = cursor.getString(cursor.getColumnIndex(MediaStore.Video.Media.TITLE));
                    String duration = cursor.getString(cursor.getColumnIndex(MediaStore.Video.Media.DURATION));
                    String data2 = cursor.getString(cursor.getColumnIndex(MediaStore.Video.Media.DATA));

                    Log.d("Video Activity", title);
                } while (cursor.moveToNext());
            }

            File vidFile = new File(vidUri.getPath());
            Log.d("Video Activity", vidFile.getName() + " in " + vidFile.getAbsolutePath());
        }
    }

    public void uploadVideo(View view) {
        Log.d("Video Activity", "Uploading video");
        vidView.setVideoURI(vidUri);
        //vidView.start();

        Toast.makeText(this, "Video has been submitted", Toast.LENGTH_LONG);

        startActivity(new Intent(ItemVideoActivity.this, NewItemDetailsActivity.class));
    }
}
