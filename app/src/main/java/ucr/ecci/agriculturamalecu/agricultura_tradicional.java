package ucr.ecci.agriculturamalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.os.Bundle;

public class agricultura_tradicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultura_tradicional);
        final Context context = this;

        //inicializamos los cardview del menú
        CardView btn_intro = findViewById(R.id.btn_intro);
    }
}
