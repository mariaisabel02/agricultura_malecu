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
    MediaPlayer raw_paranh;
    MediaPlayer raw_lhurri;
    MediaPlayer raw_purunaf;
    MediaPlayer raw_poli;
    MediaPlayer raw_oterra;
    MediaPlayer raw_tonh;
    MediaPlayer raw_aluti;
    MediaPlayer raw_cujo;
    MediaPlayer raw_catonh;
    MediaPlayer raw_nharilhunh;
    MediaPlayer raw_tucuru;
    MediaPlayer raw_tueju;
    MediaPlayer raw_torouruma;
    MediaPlayer raw_camon;
    MediaPlayer raw_parinhipis;
    MediaPlayer raw_caroqui;
    MediaPlayer raw_culha;
    MediaPlayer raw_cuctinh;
    MediaPlayer raw_catuju;
    MediaPlayer raw_caracu;
    MediaPlayer raw_vocabulario;
    MediaPlayer raw_vocabulario3;

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

        //inicializamos los audios del menu principal
        raw_paranh = MediaPlayer.create(vocabulario2.this, R.raw.paranh);
        raw_lhurri = MediaPlayer.create(vocabulario2.this, R.raw.lhurri);
        raw_purunaf = MediaPlayer.create(vocabulario2.this, R.raw.purunaf);
        raw_poli = MediaPlayer.create(vocabulario2.this, R.raw.poli);
        raw_oterra = MediaPlayer.create(vocabulario2.this, R.raw.oterra);
        raw_tonh = MediaPlayer.create(vocabulario2.this, R.raw.tonh);
        raw_aluti = MediaPlayer.create(vocabulario2.this, R.raw.aluti);
        raw_cujo = MediaPlayer.create(vocabulario2.this, R.raw.cujo);
        raw_catonh = MediaPlayer.create(vocabulario2.this, R.raw.catonh);
        raw_nharilhunh = MediaPlayer.create(vocabulario2.this, R.raw.nharilhunh);
        raw_camon = MediaPlayer.create(vocabulario2.this, R.raw.camon);
        raw_parinhipis = MediaPlayer.create(vocabulario2.this, R.raw.parinhipis);
        raw_caroqui = MediaPlayer.create(vocabulario2.this, R.raw.caroqui);
        raw_culha = MediaPlayer.create(vocabulario2.this, R.raw.culha);
        raw_cuctinh = MediaPlayer.create(vocabulario2.this, R.raw.cuctinh);
        raw_catuju = MediaPlayer.create(vocabulario2.this, R.raw.catuju);
        raw_caracu = MediaPlayer.create(vocabulario2.this, R.raw.caracu);

        raw_vocabulario = MediaPlayer.create(vocabulario2.this, R.raw.activity_vocabulario);
        raw_vocabulario3 = MediaPlayer.create(vocabulario2.this, R.raw.activity_vocabulario3);

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_paranh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_paranh.start();
            }
        });

        btn_lhurri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhurri.start();
            }
        });

        btn_purunaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_purunaf.start();
            }
        });

        btn_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_poli.start();
            }
        });

        btn_oterra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_oterra.start();
            }
        });

        btn_tonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_tonh.start();
            }
        });

        btn_aluti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_aluti.start();
            }
        });

        btn_cujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_cujo.start();
            }
        });

        btn_catonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_catonh.start();
            }
        });

        btn_nharilhunh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_nharilhunh.start();
            }
        });

        btn_tucuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_tucuru.start();
            }
        });

        btn_tueju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_tueju.start();
            }
        });

        btn_torouruma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_torouruma.start();
            }
        });

        btn_camon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_camon.start();
            }
        });

        btn_parinhipis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_parinhipis.start();
            }
        });

        btn_caroqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_caroqui.start();
            }
        });

        btn_culha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_culha.start();
            }
        });

        btn_cuctinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_cuctinh.start();
            }
        });

        btn_catuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_catuju.start();
            }
        });

        btn_caracu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_caracu.start();
            }
        });

        boton_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario3.class);
                raw_vocabulario3.start();
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
                raw_vocabulario.start();
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);;
            }
        });
    }

}
