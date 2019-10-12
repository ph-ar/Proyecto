package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroduccionActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnin;
    Button btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion);
        btnin = (Button) findViewById(R.id.button14);
        btnin.setOnClickListener(this);

        btnsig = (Button) findViewById(R.id.button15);
        btnsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(IntroduccionActivity.this,PrimerapartActivity.class);
                startActivity(si);
                finish();
            }
        });

    }


    @Override
    public void onClick(View v) {
        Intent in = new Intent(this,Menu.class);
        startActivity(in);
        finish();
    }
}
