package com.example.ugrf.views.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ugrf.R;
import com.google.ar.sceneform.assets.RenderableSource;
import com.google.ar.sceneform.rendering.ModelRenderable;

import java.io.File;

public class ARActivity extends AppCompatActivity {
    private Fragment arFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        arFragment = getSupportFragmentManager().findFragmentById(R.id.arFragment);

        build3DModel();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    void build3DModel () {
        String uri = "https://github.com/KhronosGroup/glTF-Sample-Models/raw/master/2.0/Duck/glTF-Binary/Duck.glb";
        ModelRenderable.builder()
            .setSource(this, RenderableSource.builder().setSource(
                this,
                Uri.parse(uri),
                RenderableSource.SourceType.GLB)
                .setScale(0.1f)
                .setRecenterMode(RenderableSource.RecenterMode.ROOT)
                .build()).
            setRegistryId(uri)
            .build()
            .thenAccept(modelRenderable -> modelRenderable = modelRenderable)
            .exceptionally(
                    throwable -> {
                        Log.e("ARActivity", "unable to load renderable", throwable);
                        return null;
                    });
    }

    public void backToItems(View view) {
    }

    public void addCart(View view) {
    }
}
