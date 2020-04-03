package com.example.mobilejumat11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnTest;
    private TextView txtTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTest = findViewById(R.id.testButton);
        txtTest = findViewById(R.id.testText);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),
                "Main Activity Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),
                "Main Activity Resumed", Toast.LENGTH_SHORT).show();
    }
}
//            txtTest.setText("Hello");
//            Toast.makeText(getApplicationContext(),"Hello World", Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(), "Test", Toast.LENGTH_SHORT).show();

//            Snackbar snackbar = Snackbar
//                    .make(v, "Welcome to LnT", Snackbar.LENGTH_LONG)
//                    .setAction("Click", new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            Toast.makeText(getApplicationContext(),
//                                    "Snackbar berhasil", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//            snackbar.show();
//
//
