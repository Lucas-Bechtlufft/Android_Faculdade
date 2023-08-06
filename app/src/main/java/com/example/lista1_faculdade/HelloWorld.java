package com.example.lista1_faculdade;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to handle the button click event
    public void goToAnotherPage(View view) {
        // Replace "AnotherActivity" with the actual name of your destination activity
        Intent intent = new Intent(this, Sorteio.class);
        startActivity(intent);
    }

    public void goToAnotherPage2(View view){

        Intent intent = new Intent(this, ClickButton.class);
        startActivity(intent);
    }
}
