package com.example.actividad11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNombre = (EditText) findViewById(R.id.textNombre);
    }
    public void enviarDatos(View view){
        switch (view.getId()){
            case R.id.btmEnviar:
                Intent miIntent = new Intent(MainActivity.this,MensajeActivity.class);

                Bundle miBundle= new Bundle();
                miBundle.putString("nombre",campoNombre.getText().toString());

                miIntent.putExtras(miBundle);

                startActivity(miIntent);
                break;
        }
    }
}