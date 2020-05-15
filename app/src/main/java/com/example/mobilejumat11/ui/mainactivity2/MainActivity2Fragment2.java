package com.example.mobilejumat11.ui.mainactivity2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.mobilejumat11.R;

public class MainActivity2Fragment2 extends Fragment {

    private MainActivity2ViewModel mViewModel;
    private Button frag2;

    public static MainActivity2Fragment2 newInstance() {
        return new MainActivity2Fragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_activity2_fragment2, container, false);

        frag2 = rootView.findViewById(R.id.frag2btn);

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "ini fragment 2", Toast.LENGTH_SHORT).show();
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

}
