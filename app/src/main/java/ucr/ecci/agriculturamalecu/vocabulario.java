package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vocabulario extends AppCompatActivity {
    MediaPlayer raw_ainh;
    MediaPlayer raw_lhulaunha;
    MediaPlayer raw_lhutu;
    MediaPlayer raw_caju;
    MediaPlayer raw_iyanh;
    MediaPlayer raw_lhuma;
    MediaPlayer raw_afojor;
    MediaPlayer raw_lhunhoqui;
    MediaPlayer raw_cafata;
    MediaPlayer raw_ihuli;
    MediaPlayer raw_errefa;
    MediaPlayer raw_pina;
    MediaPlayer raw_porilh;
    MediaPlayer raw_chiquitarequi;
    MediaPlayer raw_paranh;
    MediaPlayer raw_ihurri;
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
    MediaPlayer raw_parínhipis;
    MediaPlayer raw_caroqui;
    MediaPlayer raw_culha;
    MediaPlayer raw_cuctinh;
    MediaPlayer raw_catuju;
    MediaPlayer raw_caracu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario);
        ImageButton boton_principal = (ImageButton)findViewById(R.id.btn_principal);
        ImageButton boton_adelante = (ImageButton)findViewById(R.id.btn_adelante);
        final Context context = this;

        //inicializamos los cardview del vocabulario
        CardView btn_ainh = findViewById(R.id.btn_ainh);
        CardView btn_lhulaunha = findViewById(R.id.btn_lhulaunha);
        CardView btn_lhutu = findViewById(R.id.btn_lhutu);
        CardView btn_caju = findViewById(R.id.btn_caju);
        CardView btn_iyanh = findViewById(R.id.btn_iyanh);
        CardView btn_lhuma = findViewById(R.id.btn_lhuma);
        CardView btn_afojor = findViewById(R.id.btn_afjor);
        CardView btn_lhunhoqui = findViewById(R.id.btn_lhunhoqui);
        CardView btn_cafata = findViewById(R.id.btn_cafata);
        CardView btn_ihuli = findViewById(R.id.btn_ihuli);
        CardView btn_errefa = findViewById(R.id.btn_errefa);
        CardView btn_pina = findViewById(R.id.btn_pina);
        CardView btn_porilh = findViewById(R.id.btn_porilh);
        CardView btn_chiquitarequi = findViewById(R.id.btn_chiquitarequi);
        CardView btn_paranh = findViewById(R.id.btn_paranh);
        CardView btn_lhurri = findViewById(R.id.btn_ihurri);
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
        CardView btn_parínhipis = findViewById(R.id.btn_parinhipis);
        CardView btn_caroqui = findViewById(R.id.btn_caroqui);
        CardView btn_culha = findViewById(R.id.btn_culha);
        CardView btn_cuctinh = findViewById(R.id.btn_cuctinh);
        CardView btn_catuju = findViewById(R.id.btn_catuju);
        CardView btn_caracu = findViewById(R.id.btn_caracu);
        //Ahora con herramientas.

        //inicializamos los audios del menu principal
        raw_ainh = MediaPlayer.create(vocabulario.this, R.raw.ainh);

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_ainh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_ainh.start();
            }
        });

        btn_lhulaunha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhulaunha.start();
            }
        });

        btn_lhutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhutu.start();
            }
        });

        btn_caju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_caju.start();
            }
        });

        btn_iyanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_iyanh.start();
            }
        });

        btn_lhuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhuma.start();
            }
        });

        btn_afojor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_afojor.start();
            }
        });

        btn_lhulaunha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhulaunha.start();
            }
        });

        btn_lhunhoqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhunhoqui.start();
            }
        });

        btn_cafata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_cafata.start();
            }
        });


        boton_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario2.class);
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
    }
}
