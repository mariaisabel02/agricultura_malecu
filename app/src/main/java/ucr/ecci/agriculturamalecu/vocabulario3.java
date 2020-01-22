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
    int sonido = 0;

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

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click
        btn_cora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                frenarAudio();
                mp = MediaPlayer.create(vocabulario3.this, R.raw.lhaca);
                mp.start();
                sonido = 1;
            }
        });

        btn_cora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                frenarAudio();
                mp = MediaPlayer.create(vocabulario3.this, R.raw.lhaca2);
                mp.start();
                sonido = 1;
            }
        });

        btn_pupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                frenarAudio();
                mp = MediaPlayer.create(vocabulario3.this, R.raw.pupa);
                mp.start();
                sonido = 1;
            }
        });

        btn_aje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                frenarAudio();
                MediaPlayer.create(vocabulario3.this, R.raw.aje);
                mp.start();
                sonido = 1;
            }
        });

        btn_yuqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                frenarAudio();
                mp = MediaPlayer.create(vocabulario3.this, R.raw.yuqui);
                mp.start();
                sonido = 1;
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
                frenarAudio();
                mp = MediaPlayer.create(vocabulario3.this, R.raw.activity_vocabulario2);
                mp.start();
                sonido = 1;
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });
    }


    private void frenarAudio() {
        if (sonido == 1) {
            mp.stop();
            mp.release();
            mp = null;
            sonido = 0;
        }
    }
}
