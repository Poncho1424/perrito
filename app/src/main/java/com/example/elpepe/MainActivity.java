package com.example.elpepe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.edad);
        TextView resulttext = findViewById(R.id.resultado);
        Button button = findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadedit.getText().toString();
                int edadint = Integer.parseInt(edad);
                int resultado = edadint * 7;
                String resultadostring = "La edad del michi es: " + resultado + "años";
                resulttext.setText(resultadostring);
                if (!edad.isEmpty()) {
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadostring = "La edad del michi es: " + resultado + "años";
                    resulttext.setText(resultadostring);

                }
                Toast.makeText(MainActivity.this, "Agrega una michi edad", Toast.LENGTH_LONG).show();
            }
            });
    }
}
