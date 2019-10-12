package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundapartActivity extends AppCompatActivity implements View.OnClickListener {
    Button btns;
    Button btnf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapart);
         btns = (Button) findViewById(R.id.button12);
         btns.setOnClickListener(this);

         btnf = (Button) findViewById(R.id.button7);
         btnf.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent f = new Intent(SegundapartActivity.this,TercerapartActivity.class);
                 startActivity(f);
                 finish();
             }
         });

    }

    @Override
    public void onClick(View v) {
        Intent s = new Intent(this,PrimerapartActivity.class);
        startActivity(s);
        finish();
    }
}
