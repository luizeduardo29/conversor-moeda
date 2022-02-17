package com.example.conversor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TelaSuporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_suporte);

        findViewById(R.id.VoltarMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirRetornoMenu();
            }
        });
    }

    public void exibirRetornoMenu() {
        AlertDialog.Builder magBox = new AlertDialog.Builder(this);
        magBox.setTitle("Confirmar envio...");
        magBox.setIcon(android.R.drawable.ic_dialog_email);
        magBox.setMessage("Deseja confirmar envio de mensagem ao suporte?");
        magBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TelaSuporte.this, "Mensagem enviada", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent4);
            }
        });
        magBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TelaSuporte.this, "Mensagem não enviada", Toast.LENGTH_SHORT).show();
            }
        });
        magBox.show();
    }
}