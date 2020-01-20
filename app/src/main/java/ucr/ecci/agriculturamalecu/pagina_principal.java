package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class pagina_principal extends AppCompatActivity {
    MediaPlayer raw_vocabulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        final Context context = this;

        //inicializamos los cardview del menú
        CardView btn_introduccion = findViewById(R.id.btn_introduccion);
        CardView btn_vocabulario = findViewById(R.id.btn_vocabulario);
        CardView btn_agricultura = findViewById(R.id.btn_agricultura);

        //inicializamos los audios del menu principal
        raw_vocabulario = MediaPlayer.create(pagina_principal.this, R.raw.activity_vocabulario);

        btn_introduccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, introduccion.class);
                startActivity(intent);
            }
        });

        btn_vocabulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario.class);
                raw_vocabulario.start();
                startActivity(intent);
            }
        });
    }
}
