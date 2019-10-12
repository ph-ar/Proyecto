package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TercerapartActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnan;
    Button btnsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercerapart);

        btnan = (Button) findViewById(R.id.button11);
        btnan.setOnClickListener(this);

        btnsi =(Button) findViewById(R.id.button8);
        btnsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TercerapartActivity.this, CuartapartActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Intent a = new Intent(this,SegundapartActivity.class);
        startActivity(a);
        finish();
    }
}
