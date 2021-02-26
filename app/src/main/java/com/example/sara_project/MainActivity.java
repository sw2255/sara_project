package com.example.sara_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayRatingsActivity.class);

        SeekBar physSeek = (SeekBar) findViewById(R.id.seekBarPhys);
        SeekBar mentalSeek = (SeekBar) findViewById(R.id.seekBarMental);

        Integer physicalVal = physSeek.getProgress();
        Integer mentalVal = mentalSeek.getProgress();
        String message = physicalVal.toString() + " for physical wellness and " + mentalVal.toString() + " for mental wellness.";

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}