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

        btn_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, pagina_principal.class);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });

        btn_ainh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ainh.class);
                empezarAudio(R.raw.ainh);
                startActivity(intent);
            }
        });

        btn_iyanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, iyanh.class);
                empezarAudio(R.raw.iyanh);
                startActivity(intent);
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
            }
        });

        btn_lhutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, lhutu.class);
                empezarAudio(R.raw.lhutu);
                startActivity(intent);
            }
        });

        btn_caju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, caju.class);
                empezarAudio(R.raw.caju);
                startActivity(intent);
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
