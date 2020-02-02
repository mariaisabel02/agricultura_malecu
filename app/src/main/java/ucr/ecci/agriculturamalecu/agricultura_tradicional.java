package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.View.OnClickListener;

public class agricultura_tradicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultura_tradicional);
        final Context context = this;

        //inicializamos los cardview del menú
        CardView btn_intro = findViewById(R.id.btn_intro);
        CardView btn_ainh = findViewById(R.id.btn_ainh1);

        btn_ainh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, ainh.class);
                startActivity(intent);
            }
        });


    }
}
