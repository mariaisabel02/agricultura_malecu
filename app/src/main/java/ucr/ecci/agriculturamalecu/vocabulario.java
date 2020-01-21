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
    MediaPlayer raw_lhuli;
    MediaPlayer raw_errefa;
    MediaPlayer raw_pina;
    MediaPlayer raw_porilh;
    MediaPlayer raw_chiquitarequi;
    MediaPlayer raw_vocabulario2;

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
        CardView btn_lhuli = findViewById(R.id.btn_lhuli);
        CardView btn_errefa = findViewById(R.id.btn_errefa);
        CardView btn_pina = findViewById(R.id.btn_pina);
        CardView btn_porilh = findViewById(R.id.btn_porilh);
        CardView btn_chiquitarequi = findViewById(R.id.btn_chiquitarequi);

        //inicializamos los audios del menu principal
        raw_ainh = MediaPlayer.create(vocabulario.this, R.raw.ainh);
        raw_lhulaunha = MediaPlayer.create(vocabulario.this, R.raw.lhulaunha);
        raw_lhutu = MediaPlayer.create(vocabulario.this, R.raw.lhutu);
        raw_caju = MediaPlayer.create(vocabulario.this, R.raw.caju);
        raw_iyanh = MediaPlayer.create(vocabulario.this, R.raw.iyanh);
        raw_lhuma = MediaPlayer.create(vocabulario.this, R.raw.lhuma);
        raw_afojor = MediaPlayer.create(vocabulario.this, R.raw.afojor);
        raw_lhunhoqui = MediaPlayer.create(vocabulario.this, R.raw.lhunhoqui);
        raw_cafata = MediaPlayer.create(vocabulario.this, R.raw.cafata);
        raw_lhuli = MediaPlayer.create(vocabulario.this, R.raw.lhuli);
        raw_errefa = MediaPlayer.create(vocabulario.this, R.raw.errefa);
        raw_pina = MediaPlayer.create(vocabulario.this, R.raw.pina);
        raw_porilh = MediaPlayer.create(vocabulario.this, R.raw.porilh);
        raw_chiquitarequi = MediaPlayer.create(vocabulario.this, R.raw.chiquitarequi);
        raw_vocabulario2 = MediaPlayer.create(vocabulario.this, R.raw.activity_vocabulario2);

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

        btn_lhuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_lhuli.start();
            }
        });

        btn_errefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_errefa.start();
            }
        });

        btn_pina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_pina.start();
            }
        });

        btn_porilh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_porilh.start();
            }
        });

        btn_chiquitarequi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                raw_chiquitarequi.start();
            }
        });

        boton_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario2.class);
                raw_vocabulario2.start();
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
