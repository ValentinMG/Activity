package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;
    private EditText edit_numero_uno;
    private EditText edit_numero_dos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma(Integer.parseInt(edit_numero_uno.getText().toString()), Integer.parseInt(edit_numero_dos.getText().toString()) );
            }
        });
        btn_resta = findViewById(R.id.button_resta);


        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_division = findViewById(R.id.button_division);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);

    }
    public int suma (int a,int b){
        return a+b;
    }
    public int resta (int a,int b){
        return a-b;
    }
    public int multiplicacion (int a,int b){
        return a*b;
    }
    public int division (int a,int b){
        return a/b;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Uri sitio= Uri.parse("http://www.udh.edu.pe/");
                Intent intentItem1 = new Intent(Intent.ACTION_VIEW, sitio);
                startActivity(intentItem1);
                return true;

            case R.id.item2:
                Intent intentItem2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentItem2);
                return true;

        }
    }


}