package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool

        // TODO: Load and get the IDs to identify the sounds

    }

    // TODO: Add the play methods triggered by the buttons

    public void playA(View v){
        Log.d("X", "Playing Sound A");
    }

    public void playB(View v){
        Log.d("X", "Playing Sound B");
    }

    public void playC(View v){
        Log.d("X", "Playing Sound C");
    }

    public void playD(View v) {
        Log.d("X", "Playing Sound D");
    }

    public void playE(View v) {
        Log.d("X", "Playing Sound E");
    }

    public void playF(View v) {
        Log.d("X", "Playing Sound F");
    }

    public void playG(View v){
        Log.d("X", "Playing Sound G");
    }
}
