package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button sal, mat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        sal = (Button) findViewById(R.id.ventanauni);
        mat = (Button) findViewById(R.id.ventanaest);
        sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity4.this, UniversidadAct2.class);
                MainActivity4.this.startActivity(myIntent);
            }
        });
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity4.this, EstudianteAct2.class);
                MainActivity4.this.startActivity(myIntent);
            }
        });

    }
}