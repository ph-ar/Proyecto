package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImportanciaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_importancia);
        btng = (Button) findViewById(R.id.button50);
        btng.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent ba = new Intent(this,Menu.class);
        startActivity(ba);
        finish();
    }
}
