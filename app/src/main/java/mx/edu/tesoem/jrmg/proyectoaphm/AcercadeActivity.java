package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercadeActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btnace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        btnace = (Button) findViewById(R.id.button16);
        btnace.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent ac = new Intent(this,Menu.class);
        startActivity(ac);
        finish();
    }
}
