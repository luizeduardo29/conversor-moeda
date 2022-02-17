package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Converter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaConverter();
            }
        });

        findViewById(R.id.Popular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaPopular();
            }
        });

        findViewById(R.id.Suporte).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaSuporte();
            }
        });
    }

    public void telaConverter(){
        Intent intent1 = new Intent(getApplicationContext(), TelaConverter.class);
        startActivity(intent1);
    }

    public void telaPopular(){
        Intent intent2 = new Intent(getApplicationContext(), TelaPopular.class);
        startActivity(intent2);
    }

    public void telaSuporte(){
        Intent intent3 = new Intent(getApplicationContext(), TelaSuporte.class);
        startActivity(intent3);
    }
}