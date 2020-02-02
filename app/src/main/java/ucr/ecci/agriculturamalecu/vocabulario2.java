package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vocabulario2 extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario2);
        ImageButton boton_principal = (ImageButton)findViewById(R.id.btn_principal);
        ImageButton boton_adelante = (ImageButton)findViewById(R.id.btn_adelante);
        ImageButton boton_atras = (ImageButton)findViewById(R.id.btn_atras);
        final Context context = this;

        //inicializamos los cardview del vocabulario
        CardView btn_paranh = findViewById(R.id.btn_paranh);
        CardView btn_lhurri = findViewById(R.id.btn_lhurri);
        CardView btn_purunaf = findViewById(R.id.btn_purunaf);
        CardView btn_poli = findViewById(R.id.btn_poli);
        CardView btn_oterra = findViewById(R.id.btn_oterra);
        CardView btn_tonh = findViewById(R.id.btn_tonh);
        CardView btn_aluti = findViewById(R.id.btn_aluti);
        CardView btn_cujo = findViewById(R.id.btn_cujo);
        CardView btn_catonh = findViewById(R.id.btn_catonh);
        CardView btn_nharilhunh = findViewById(R.id.btn_nharilhunh);
        CardView btn_tucuru = findViewById(R.id.btn_tucuru);
        CardView btn_tueju = findViewById(R.id.btn_tueju);
        CardView btn_torouruma = findViewById(R.id.btn_torouruma);
        CardView btn_camon = findViewById(R.id.btn_camon);
        CardView btn_parinhipis = findViewById(R.id.btn_parinhipis);
        CardView btn_caroqui = findViewById(R.id.btn_caroqui);
        CardView btn_culha = findViewById(R.id.btn_culha);
        CardView btn_cuctinh = findViewById(R.id.btn_cuctinh);
        CardView btn_catuju = findViewById(R.id.btn_catuju);
        CardView btn_caracu = findViewById(R.id.btn_caracu);

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_paranh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.paranh);
            }
        });

        btn_lhurri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhurri);
            }
        });

        btn_purunaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.purunaf);
            }
        });

        btn_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.poli);
            }
        });

        btn_oterra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.oterra);
            }
        });

        btn_tonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.tonh);
            }
        });

        btn_aluti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.aluti);
            }
        });

        btn_cujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.cujo);
            }
        });

        btn_catonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.catonh);
            }
        });

        btn_nharilhunh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.nharilhunh);
            }
        });

        btn_tucuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.tucuru);
            }
        });

        btn_tueju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.tueju);
            }
        });

        btn_torouruma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.torouruma);
            }
        });

        btn_camon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.camon);
            }
        });

        btn_parinhipis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.parinhipis);
            }
        });

        btn_caroqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.caroqui);
            }
        });

        btn_culha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.culha);
            }
        });

        btn_cuctinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.cuctinh);
            }
        });

        btn_catuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.catuju);
            }
        });

        btn_caracu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.caracu);
            }
        });

        boton_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario3.class);
                empezarAudio(R.raw.activity_vocabulario3);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        boton_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, pagina_principal.class);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });

        boton_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario.class);
                empezarAudio(R.raw.activity_vocabulario);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });
    }

    // Frena cualquier mp sonando y empieza el audio solicitado
    public void empezarAudio(int audio)
    {
        if(mp != null && mp.isPlaying())
        {
            mp.stop();
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(vocabulario2.this, audio);
        mp.start();
    }
}
