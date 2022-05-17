package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button sal, mat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sal = (Button) findViewById(R.id.ventanauni);
        mat = (Button) findViewById(R.id.ventanaest);
        sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity3.this, UniversidadAct.class);
                MainActivity3.this.startActivity(myIntent);
            }
        });
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity3.this, EstudianteAct.class);
                MainActivity3.this.startActivity(myIntent);
            }
        });

    }
}