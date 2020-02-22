package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class agricultura_tradicional extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultura_tradicional);
        final Context context = this;


        ImageButton btn_principal = (ImageButton)findViewById(R.id.btn_principal);
        //inicializamos los cardview del menú
        CardView btn_intro = findViewById(R.id.btn_intro);
        CardView btn_ainh = findViewById(R.id.btn_ainh1);
        CardView btn_iyanh = findViewById(R.id.btn_iyanh1);
        CardView btn_lhuli = findViewById(R.id.btn_lhuli1);
        CardView btn_lhuma = findViewById(R.id.btn_lhuma1);
        CardView btn_lhutu = findViewById(R.id.btn_lhutu1);
        CardView btn_caju = findViewById(R.id.btn_caju1);
        CardView btn_pina = findViewById(R.id.btn_pina1);
        CardView btn_afojor = findViewById(R.id.btn_afojor1);
        CardView btn_chiquitarequi = findViewById(R.id.btn_chiquitarequi1);
        CardView btn_junhoqui = findViewById(R.id.btn_junhoqui1);

        btn_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, pagina_principal.class);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });

        btn_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, intro_agricultura_tradicional.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_ainh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ainh.class);
                empezarAudio(R.raw.ainh);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_iyanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, iyanh.class);
                empezarAudio(R.raw.iyanh);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_lhuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, lhuli.class);
                empezarAudio(R.raw.lhuli);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_lhuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, lhuma.class);
                empezarAudio(R.raw.lhuma);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_lhutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, lhutu.class);
                empezarAudio(R.raw.lhutu);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_caju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, caju.class);
                empezarAudio(R.raw.caju);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_pina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, pina.class);
                empezarAudio(R.raw.pina);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_afojor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, afojor.class);
                empezarAudio(R.raw.afojor);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_chiquitarequi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, chiquitarequi.class);
                empezarAudio(R.raw.chiquitarequi);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
            }
        });

        btn_junhoqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, junhoqui.class);
                empezarAudio(R.raw.junhoqui_curu);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_der, R.anim.slide_out_izq);
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
        mp = MediaPlayer.create(agricultura_tradicional.this, audio);
        mp.start();

    }
}
