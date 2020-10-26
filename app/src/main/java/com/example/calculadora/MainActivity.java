package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnSuma, btnResta, btnMultiplica, btnDivide, btnClean, btnCero, btnDoblecero, btnMasMenos, btnPunto, btnIgual;
    TextView Resultado, Resultado2;
    double resultado;
    String operador, mostrar , veroperacion, reserva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.Uno);
        btnDos = (Button)findViewById(R.id.Dos);
        btnTres = (Button)findViewById(R.id.Tres);
        btnCuatro = (Button)findViewById(R.id.Cuatro);
        btnCinco = (Button)findViewById(R.id.Cinco);
        btnSeis = (Button)findViewById(R.id.Seis);
        btnSiete = (Button)findViewById(R.id.Siete);
        btnOcho = (Button)findViewById(R.id.Ocho);
        btnNueve = (Button)findViewById(R.id.Nueve);
        btnSuma = (Button)findViewById(R.id.Mas);
        btnResta = (Button)findViewById(R.id.Menos);
        btnMultiplica = (Button)findViewById(R.id.Multiplicacion);
        btnDivide = (Button)findViewById(R.id.Division);
        btnPunto = (Button)findViewById(R.id.Punto);
        btnClean = (Button)findViewById(R.id.clean);
        Resultado = (TextView)findViewById(R.id.textView2);
        Resultado2 = (TextView)findViewById(R.id.textView);
        btnIgual = (Button)findViewById(R.id.Igual);
        btnDoblecero = (Button)findViewById(R.id.Doblecero);
        btnCero = (Button)findViewById(R.id.Cero);
        btnMasMenos = (Button)findViewById(R.id.MasMenos);

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "1";
                Resultado2.setText(veroperacion);

            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "2";
                Resultado2.setText(veroperacion);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "3";
                Resultado2.setText(veroperacion);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "4";
                Resultado2.setText(veroperacion);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "5";
                Resultado2.setText(veroperacion);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "6";
                Resultado2.setText(veroperacion);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "7";
                Resultado2.setText(veroperacion);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "8";
                Resultado2.setText(veroperacion);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "9";
                Resultado2.setText(veroperacion);
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "0";
                Resultado2.setText(veroperacion);
            }
        });

        btnDoblecero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "00";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "00";
                Resultado2.setText(veroperacion);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "+";
                Resultado2.setText(veroperacion);

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "-";
                Resultado2.setText(veroperacion);
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "x";
                Resultado2.setText(veroperacion);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + "/";
                Resultado2.setText(veroperacion);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                veroperacion = "";
                Resultado2.setText(veroperacion);
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
                veroperacion = Resultado2.getText().toString();
                veroperacion = veroperacion + ".";
                Resultado2.setText(veroperacion);
            }
        });

        btnMasMenos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                resultado = Double.parseDouble(Resultado.getText().toString()) - (Double.parseDouble(Resultado.getText().toString()) * 2);
                Resultado.setText(String.valueOf(resultado));
                Resultado2.setText(String.valueOf(resultado));
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                //mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    if (Double.parseDouble(Resultado.getText().toString()) == 0 ) {
                        Context context = getApplicationContext();
                        CharSequence text = "Error division por cero";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else {
                        resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });
    }
}