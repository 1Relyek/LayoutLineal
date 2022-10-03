package com.example.layoutlineal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Crear Objetos Graficos
    private EditText num1;
    private EditText num2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Instanciar los objetos o darles valores
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        result =findViewById(R.id.txtResultado);
    }

    public void sumar(View view)
    {
        double n1, n2, suma;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        suma = n1+n2;
        //Mostar Resultado
        result.setText(""+suma);
    }

    public void restar(View view)
    {
        double n1, n2, resta;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resta = n1-n2;
        //Mostar Resultado
        result.setText(""+resta);
    }

    public void multiplicar(View view)
    {
        double n1, n2, multiplica;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        multiplica = n1*n2;
        //Mostar Resultado
        result.setText(""+multiplica);
    }

    public void dividir(View view)
    {
        double n1, n2, dividi;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        dividi = n1/n2;
        //Mostar Resultado
        result.setText(""+dividi);
    }
}