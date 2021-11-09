package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero_uno;
    private EditText numero_dos;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //va a buscar por id lo que esta en la vista:nombre del elemento en la vista
        numero_uno= findViewById(R.id.numero_uno);
        numero_dos= findViewById(R.id.numero_dos);
        res= findViewById(R.id.Respuesta);


    }

    public void sumar(View view){
        //obtengo el texto de los cuadros de texto y los parseo y sumo
        try{
            Integer respuestaNumero= Integer.parseInt(numero_uno.getText().toString())+ Integer.parseInt(numero_dos.getText().toString());
            res.setText(respuestaNumero+"");

        }catch (Exception e){
            Toast.makeText(this,"Numeros no validos",Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View view){
     if(numero_uno.getText().length()<1 && numero_dos.getText().length()<1){
         Toast.makeText(this,"Numeros no validos",Toast.LENGTH_SHORT).show();
     }else{

         //obtengo el texto de los cuadros de texto y los parseo y sumo
         Integer respuestaNumero= Integer.parseInt(numero_uno.getText().toString())- Integer.parseInt(numero_dos.getText().toString());
         res.setText(respuestaNumero+"");
     }
    }

    public void multiplicar(View view){
        try{
            //obtengo el texto de los cuadros de texto y los parseo y sumo
            Integer respuestaNumero= Integer.parseInt(numero_uno.getText().toString())* Integer.parseInt(numero_dos.getText().toString());
            res.setText(respuestaNumero+"");
        }catch(Exception e){
            Toast.makeText(this,"Numeros no validos",Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View view){
        try{
            //obtengo el texto de los cuadros de texto y los parseo y sumo
            Integer respuestaNumero= Integer.parseInt(numero_uno.getText().toString())/ Integer.parseInt(numero_dos.getText().toString());
            res.setText(respuestaNumero+"");
        }catch (Exception e){
            Toast.makeText(this,"Numeros no validos",Toast.LENGTH_SHORT).show();
        }

    }

    public void irAPoliticas(View view){
        //clase en la que estoy y clase a la que quiero ir
        Intent i= new Intent(this, Politicas.class);
        startActivity(i);
    }

}