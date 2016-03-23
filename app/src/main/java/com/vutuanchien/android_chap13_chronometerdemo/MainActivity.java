package com.vutuanchien.android_chap13_chronometerdemo;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Chronometer chronometer;
    Button btnStart;
    Button btnStop;
    Button btnRestart;
    Button btnSet;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnRestart = (Button) findViewById(R.id.btnReStart);
        btnSet = (Button) findViewById(R.id.btnSet);
        btnClear = (Button) findViewById(R.id.btnClear);
        chronometer = (Chronometer) findViewById(R.id.chronometerShow);

//       Set onclick listener for buttons

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnRestart.setOnClickListener(this);
        btnSet.setOnClickListener(this);


    }

    @Override
//    implement view.setonclicklistenner
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnStart) {
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
        } else if (id == R.id.btnStop) {
            chronometer.stop();
        } else if (id == R.id.btnReStart) {
            chronometer.setBase(SystemClock.elapsedRealtime());
        } else if (id == R.id.btnSet) {
            chronometer.setFormat("GMT\n%s");
        } else if (id == R.id.btnClear) {
            chronometer.setFormat(null);
        }
    }
}
