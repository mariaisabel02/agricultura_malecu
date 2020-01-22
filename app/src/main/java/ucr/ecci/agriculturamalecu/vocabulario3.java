package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vocabulario3 extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario3);
        ImageButton boton_principal = (ImageButton)findViewById(R.id.btn_principal);
        ImageButton boton_atras = (ImageButton)findViewById(R.id.btn_atras);
        final Context context = this;

        //inicializamos los cardview del vocabulario
        CardView btn_cora = findViewById(R.id.btn_cora);
        CardView btn_cora2 = findViewById(R.id.btn_cora2);
        CardView btn_pupa = findViewById(R.id.btn_pupa);
        CardView btn_aje = findViewById(R.id.btn_aje);
        CardView btn_yuqui = findViewById(R.id.btn_yuqui);
        CardView btn_quita = findViewById(R.id.btn_quita);
        CardView btn_saranh = findViewById(R.id.btn_saranh);
        CardView btn_arafufu = findViewById(R.id.btn_arafufu);
        CardView btn_ajanhe = findViewById(R.id.btn_ajanhe);
        CardView btn_jerro = findViewById(R.id.btn_jerro);
        CardView btn_junhoqui = findViewById(R.id.btn_junhoqui);
        CardView btn_mafochecheca = findViewById(R.id.btn_mafochecheca);

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_cora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhaca);
            }
        });

        btn_cora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lhaca2);
            }
        });

        btn_pupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.pupa);
            }
        });

        btn_aje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.aje);
            }
        });

        btn_quita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.quita);
            }
        });

        btn_yuqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.yuqui);
            }
        });

        btn_saranh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.saranh);
            }
        });

        btn_arafufu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.arafufu);
            }
        });

        btn_ajanhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.ajanhe);
            }
        });

        btn_jerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.lherro);
            }
        });

        btn_junhoqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.junhoqui);
            }
        });

        btn_mafochecheca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                empezarAudio(R.raw.puru);
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
                Intent intent = new Intent(context, vocabulario2.class);
                empezarAudio(R.raw.activity_vocabulario2);
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
        mp = MediaPlayer.create(vocabulario3.this, audio);
        mp.start();
    }

}
