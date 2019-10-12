package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuartapartActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnh;
    Button btng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuartapart);

        btnh = (Button) findViewById(R.id.button10);
        btnh.setOnClickListener(this);

        btng = (Button) findViewById(R.id.button9);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(CuartapartActivity.this,Menu.class);
                startActivity(g);
                finish();
            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent h = new Intent(this,TercerapartActivity.class);
        startActivity(h);
        finish();
    }
}
