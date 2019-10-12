package mx.edu.tesoem.jrmg.proyectoaphm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener  {

    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(this);

        btn1 = (Button) findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Menu.this,PrimerapartActivity.class);
                startActivity(n);
                finish();
            }
        });

        btn2 = (Button) findViewById(R.id.button17);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Menu.this, SegundapartActivity.class);
                startActivity(b);
                finish();
            }
        });

        btn3 = (Button) findViewById(R.id.button22);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gv = new Intent(Menu.this, TercerapartActivity.class);
                startActivity(gv);
                finish();
            }
        });

        btn4 = (Button) findViewById(R.id.button23);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Menu.this,CuartapartActivity.class);
                startActivity(c);
                finish();
            }
        });

        btn5 = (Button) findViewById(R.id.button24);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Menu.this,ImportanciaActivity.class);
                startActivity(s);
                finish();
            }
        });

        btn6 = (Button) findViewById(R.id.button25);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Menu.this,DesvenActivity.class);
                startActivity(d);
                finish();
            }
        });

        btn7 = (Button) findViewById(R.id.button26);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Menu.this,AcercadeActivity.class);
                startActivity(h);
                finish();
            }
        });
     }

    @Override
    public void onClick(View v) {
        Intent m = new Intent(this,IntroduccionActivity.class);
        startActivity(m);
        finish();
    }
}

