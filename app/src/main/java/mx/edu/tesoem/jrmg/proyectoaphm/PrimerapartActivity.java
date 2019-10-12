package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimerapartActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnan;
    Button btnsigg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerapart);
        btnan = (Button) findViewById(R.id.button13);
        btnan.setOnClickListener(this);

        btnsigg = (Button) findViewById(R.id.button4);
        btnsigg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(PrimerapartActivity.this, SegundapartActivity.class);
                startActivity(si);
                finish();
            }
        });



        }
    @Override
    public void onClick (View v){
        Intent in = new Intent(this, IntroduccionActivity.class);
        startActivity(in);
        finish();
    }
}
