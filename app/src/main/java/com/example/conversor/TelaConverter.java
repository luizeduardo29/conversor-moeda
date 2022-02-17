package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaConverter extends AppCompatActivity {

    TextView txtValorFinal;
    EditText valorMoeda, qtdMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_converter);

        valorMoeda = findViewById(R.id.valorMoeda);
        qtdMoeda = findViewById(R.id.qtdMoeda);

        txtValorFinal = findViewById(R.id.txtValorFinal);
    }

    public void calcular(View v){
        double qtd = Double.parseDouble(qtdMoeda.getText().toString());
        double valor = Double.parseDouble(valorMoeda.getText().toString());

        double vFinal = valor * qtd;

        txtValorFinal.setText("R$: " + vFinal);
    }
}