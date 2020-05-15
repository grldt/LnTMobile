package com.example.mobilejumat11.ui.mainactivity2;

import androidx.lifecycle.ViewModelProviders;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mobilejumat11.R;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2Fragment extends Fragment {

    private MainActivity2ViewModel mViewModel;
    private Button btnFrag1;

    public static MainActivity2Fragment newInstance() {
        return new MainActivity2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_activity2_fragment, container, false);

        btnFrag1 = rootView.findViewById(R.id.frag1Btn);

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(v, "Welcome to LnT", Snackbar.LENGTH_LONG)
                        .setAction("Click", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getContext(),
                                        "Snackbar berhasil", Toast.LENGTH_SHORT).show();
                            }
                        });
                snackbar.show();
            }
        });

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainActivity2ViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
