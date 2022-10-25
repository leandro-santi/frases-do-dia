package com.leosanti.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrase(View view) {

        TextView texto = findViewById(R.id.text_frase);

        String[] frases = {"Que a força esteja com você.",
                "Muitas das verdades que temos dependem de nosso ponto de vista.",
                "O medo é o caminho para o lado negro.",
                "Faça ou não faça. A tentativa não existe.",
                "Treine a si mesmo a deixar partir tudo que teme perder.",
                "Você faz aquilo que você acha que tem fazer."
                };

        Random random = new Random();

        texto.setText(frases[random.nextInt(6)]); // 0 1 2 3 4 5

    }
}