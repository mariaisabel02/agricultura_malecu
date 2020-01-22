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
    MediaPlayer mp;

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

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_ainh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.ainh);
            }
        });

        btn_lhulaunha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhulaunha);
            }
        });

        btn_lhutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhutu);
            }
        });

        btn_caju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.caju);
            }
        });

        btn_iyanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.iyanh);
            }
        });

        btn_lhuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhuma);
            }
        });

        btn_afojor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.afojor);
            }
        });

        btn_lhulaunha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhulaunha);
            }
        });

        btn_lhunhoqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhunhoqui);
            }
        });

        btn_cafata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.cafata);
            }
        });

        btn_lhuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhuli);
            }
        });

        btn_errefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.errefa);
            }
        });

        btn_pina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.pina);
            }
        });

        btn_porilh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.porilh);
            }
        });

        btn_chiquitarequi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.chiquitarequi);
            }
        });

        boton_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, vocabulario2.class);
                empezarAudio(R.raw.activity_vocabulario2);
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

    // Frena cualquier mp sonando y empieza el audio solicitado
    public void empezarAudio(int audio)
    {
        if(mp != null && mp.isPlaying())
        {
            mp.stop();
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(vocabulario.this, audio);
        mp.start();
    }
}
