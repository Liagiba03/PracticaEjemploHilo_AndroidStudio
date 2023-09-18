package com.edu.practicahilos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {
    private EditText txtUser;
    private EditText txtContra;
    private Button btnLOg;
    private  Button btnExit;
    private String user= "USER";
    private  String contra = "12345";
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUser = findViewById(R.id.etxtMail);
        txtContra = findViewById(R.id.etxtContra);
        btnExit = findViewById(R.id.buttonSalir);
        btnLOg = findViewById(R.id.buttonLogin);

        btnLOg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUser.getText().toString().equals(user)){
                    if(txtContra.getText().toString().equals(contra)){
                        Toast.makeText(getApplicationContext(), "INICIO EXITOSO!!", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "Usario Incorrecto", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}