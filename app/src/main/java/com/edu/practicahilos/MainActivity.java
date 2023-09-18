package com.edu.practicahilos;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREACION DE HILOS
        //Se hace una instancia a una clase handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent enlace = new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(enlace);
                finish();
            }
        },3000);
    }
}