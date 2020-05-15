package com.example.mobilejumat11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mobilejumat11.ui.mainactivity2.MainActivity2Fragment;
import com.example.mobilejumat11.ui.mainactivity2.MainActivity2Fragment2;

public class MainActivity2 extends AppCompatActivity {

    private Button frag1;
    private Button frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivity2Fragment.newInstance())
                    .commitNow();
        }

        frag1 = findViewById(R.id.btnFrag1);
        frag2 = findViewById(R.id.btnFrag2);

        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, MainActivity2Fragment.newInstance())
                        .commitNow();
            }
        });

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, MainActivity2Fragment2.newInstance())
                        .commitNow();
            }
        });
    }
}
