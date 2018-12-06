package com.example.idel2101.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.fButton);
        button3 = (Button) findViewById(R.id.gButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);}

      public void onButton1Click( View v)  {
        mpE.seekTo(0);
        Log.e (TAG, "button1 clicked");
        mpE.start();
        }
 public void onButton2Click(View v) {
            mpF.seekTo(0);
            Log.e (TAG, "button2 clicked");
            mpF.start();
    }
    public void onButton3Click(View v) {
        mpG.seekTo(0);
        Log.e (TAG, "button3 clicked");
        mpG.start();
    }
}
