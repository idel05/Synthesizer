package com.example.idel2101.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mphE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.fButton);
        button3 = (Button) findViewById(R.id.gButton);
        button4 = (Button) findViewById(R.id.aButton);
        button5 = (Button) findViewById(R.id.bButton);
        button6 = (Button) findViewById(R.id.cButton);
        button7 = (Button) findViewById(R.id.dButton);
        button8 = (Button) findViewById(R.id.mChallenge1);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mphE = MediaPlayer.create(this, R.raw.scalehighe);
    }

     private void delayPlaying (int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e)  {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
     }


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
    public void onButton4Click(View v) {
        mpA.seekTo(0);
        Log.e (TAG, "button4 clicked");
        mpA.start();
    }
    public void onButton5Click(View v) {
        mpB.seekTo(0);
        Log.e (TAG, "button5 clicked");
        mpB.start();
    }
    public void onButton6Click(View v) {
        mpC.seekTo(0);
        Log.e (TAG, "button6 clicked");
        mpC.start();
    }
    public void onButton7Click(View v) {
        mpD.seekTo(0);
        Log.e (TAG, "button7 clicked");
        mpD.start();
    }
 // mChallenge1.setOnClickListener(new View.OnClickListener) {

        public void onButton8Click(View v){
           mpE.seekTo(0);
            Log.e("SynthesizerActivity", "Challenge 0 Button Clicked");
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpGs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpDs.start();
            delayPlaying(WHOLE_NOTE/2);
            mphE.start();
        }
    }

