package com.example.david.angelsolve;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class VideoCam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_cam);
    }
    public void start_button1 (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
}
