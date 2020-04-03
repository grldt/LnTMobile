package com.example.mobilejumat11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class NewActivity extends AppCompatActivity {

    private Button submit;
    private EditText text;
    private TextView txt;

    private SharedPreferences preferences;

    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        submit = findViewById(R.id.asdf);
        text = findViewById(R.id.textET);
        txt = findViewById(R.id.textTV);

        //Buat file baru
        preferences = getSharedPreferences("LnT Preferences", Context.MODE_PRIVATE);

        txt.setText("Saved data: " + preferences.getString("data_test", null));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
                Toast.makeText(getApplicationContext(),
                        "Data saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
//        Toast.makeText(getApplicationContext(),
//                "Activity Destroyed", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(),
                "Activity Restarted", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    private void getData() {
        //Ambil input user
        String getInput = text.getText().toString();

        editor = preferences.edit();
        editor.putString("data_test", getInput);
        editor.apply();
        txt.setText("Saved data: " + preferences.getString("data_test", null));
    }


}
                //validasi kalo kosong
//                if(text.toString().isEmpty()) {
//                    Snackbar.make(v, "Text cannot be empty!", Snackbar.LENGTH_LONG).show();
////                    snackbar.show();
//
//
//                }
//                //kalo tulisan == "Hello World", maka buka activity main
//                else if(text.toString().equals("Hello World")){
//                    startActivity(new Intent(NewActivity.this, MainActivity.class));
//                }

//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://bncc.net")));
