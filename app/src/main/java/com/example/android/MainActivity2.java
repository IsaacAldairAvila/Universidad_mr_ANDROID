package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button bte1, bte2, bte3, bte4, bte5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bte1 = (Button) findViewById(R.id.bte1);
        bte1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EJERCICIO1.class);
                startActivity(intent);
            }
        });
        bte2 = (Button) findViewById(R.id.bte2);
        bte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EJERCICIO2.class);
                startActivity(intent);
            }
        });
        bte3 = (Button) findViewById(R.id.bte3);
        bte3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EJERCICIO3.class);
                startActivity(intent);
            }
        });
        bte4 = (Button) findViewById(R.id.bte4);
        bte4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EJERCICIO4.class);
                startActivity(intent);
            }
        });
        bte5 = (Button) findViewById(R.id.bte5);
        bte5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, EJERCICIO5.class);
                startActivity(intent);
            }
        });
    }
}