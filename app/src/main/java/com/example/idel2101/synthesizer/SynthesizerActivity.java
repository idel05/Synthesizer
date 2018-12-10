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
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpD;


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
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpD = MediaPlayer.create(this, R.raw.scaled);}

     private void delayPlaying (int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e)  {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
     }
       mChallenge1.setOnClickListener(new View.OnClickListener() {
           @Override
        public void OnClick(View v){
            Log.e("SynthesizerActivity", "Challenge 0 Button Clicked");
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
        }
        )};

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
        mpD.seekTo(
                0);
        Log.e (TAG, "button7 clicked");
        mpD.start();
    }

}
