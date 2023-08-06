package com.example.lista1_faculdade;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.lista1_faculdade.databinding.ActivityClickButtonBinding;

public class ClickButton extends AppCompatActivity {

    private Button btnClick;

    private TextView ResultadoClick;
    int numStr;
    @Override

        protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_button);

        btnClick = findViewById(R.id.btnClick);
        ResultadoClick = findViewById(R.id.ResultadoClick);


        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                contadorClicks();
            }
        });
    }
    private void contadorClicks() {
        numStr++;
        ResultadoClick.setText("" + numStr);

    }

}