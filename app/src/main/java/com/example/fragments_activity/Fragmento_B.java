package com.example.fragments_activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragmento_B extends Fragment {

    public Fragmento_B() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewFragB = inflater.inflate(R.layout.fragment_b, container, false);
        TextView msgView = viewFragB.findViewById(R.id.mensagem);
        Bundle bundle = getArguments();

        if (bundle != null && bundle.containsKey("message")) {
            String message = bundle.getString("message");
            msgView.setText(message);
        }

        return viewFragB;
    }
}