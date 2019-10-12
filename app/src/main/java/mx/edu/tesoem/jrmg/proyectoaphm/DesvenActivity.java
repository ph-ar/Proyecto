package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesvenActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desven);
        btnfa = (Button) findViewById(R.id.button20);
        btnfa.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent fa = new Intent(this,Menu.class);
        startActivity(fa);
        finish();

    }
}
