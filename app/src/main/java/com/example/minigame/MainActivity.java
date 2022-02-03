package com.example.minigame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText num;
    public TextView respuesta;
    public Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.number1);
        respuesta = (TextView) findViewById(R.id.resultado);
        btn1 = (Button) findViewById(R.id.botonstar);
        btn2 = (Button) findViewById(R.id.botonsalir);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero=Integer.parseInt(num.getText().toString());

                if ((numero%2)==0){
                    respuesta.setText("El numero es par");
                }
                else {
                    Toast.makeText(getApplicationContext(), "El numero es impar", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}