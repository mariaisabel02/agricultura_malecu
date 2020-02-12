package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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

        //para guardar si es la primera vez que se uso el app o no
        SharedPreferences primer_launch = getSharedPreferences("primer_launch", MODE_PRIVATE);
        boolean primer_uso = primer_launch.getBoolean("primer_uso",true);

        if(primer_uso) {
            mostrar_tutorial();
        }
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
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_vocabulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario.class);
                raw_vocabulario.start();
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_agricultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, agricultura_tradicional.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });
    }

    private void mostrar_tutorial(){
        //mostrar dialogo de explicacion
        new AlertDialog.Builder(this)
                .setTitle("¡Bienvenido!")
                .setMessage("Para consultar haga click en un ícono")
                .setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        dialog.dismiss();
            }
        }).create().show();
        SharedPreferences primer_launch = getSharedPreferences("primer_launch",MODE_PRIVATE);
        SharedPreferences.Editor editor = primer_launch.edit();
        editor.putBoolean("primer_uso", false);
        editor.apply();
    }
}


// tutorial para desplegar mensaje la primera vez que se abre el app :
//https://www.youtube.com/watch?v=2I1n6A6JJzw&list=LLaQ-P4qVvvTc1EPxakbKCuw&index=3&t=0s