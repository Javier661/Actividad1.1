package com.example.actividad11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    TextView msj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        msj = (TextView) findViewById(R.id.textNombreMaj);

        Bundle miBundle = this.getIntent().getExtras();

        if(miBundle!=null){

            String nombre = miBundle.getString("nombre");
            msj.setText(nombre);
        }
    }
    public void onclick(View view){
        finish();
    }
}