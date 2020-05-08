package com.example.mobilejumat11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mobilejumat11.ui.mainactivity2.MainActivity2Fragment;
import com.example.mobilejumat11.ui.mainactivity2.MainActivity2Fragment2;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivity2Fragment.newInstance())
                    .commitNow();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container2, MainActivity2Fragment2.newInstance())
                    .commitNow();
        }
    }
}
