package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// button_sumar,

    private Button button_nueve, button_ocho, button_siete, button_seis, button_game, //Numeros Enteros
            button_clear_ce, button_decimal, button_cinco, button_cuatro,//Numeros Enteros
            button_tres, button_dos, button_uno, button_cero, button_igual, //Numeros Enteros
            button_suma, button_resta, button_multi, button_divi, button_factorial, button_modulo;//Operaciones Atitmeticas


    private TextView textView, etconca;
    private double numero1, numero2, resultado;
    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //NUMEROS********************************************
        button_nueve = (Button) findViewById(R.id.button_nueve);
        button_ocho = (Button) findViewById(R.id.button_ocho);
        button_siete = (Button) findViewById(R.id.button_siete);
        button_seis = (Button) findViewById(R.id.button_seis);
        button_cinco = (Button) findViewById(R.id.button_cinco);
        button_cuatro = (Button) findViewById(R.id.button_cuatro);
        button_tres = (Button) findViewById(R.id.button_tres);
        button_dos = (Button) findViewById(R.id.button_dos);
        button_uno = (Button) findViewById(R.id.button_uno);
        button_cero = (Button) findViewById(R.id.button_cero);

        //Mostrar Resultado //textViewResultado******************
        textView = (TextView) findViewById(R.id.textViewResultado);

        //Operaciones Aritmeticas******************************
        button_modulo = (Button) findViewById(R.id.button_porcentaje);
        button_factorial = (Button) findViewById(R.id.button_factoriar);
        button_divi = (Button) findViewById(R.id.button_divi);
        button_multi = (Button) findViewById(R.id.button_multiplicar);
        button_resta = (Button) findViewById(R.id.button_resta);
        button_suma = (Button) findViewById(R.id.button_suma);
        button_igual = (Button) findViewById(R.id.button_igual);
        button_clear_ce = (Button) findViewById(R.id.button_limpiar);
        button_decimal = (Button) findViewById(R.id.button_decimal);
        button_game = (Button) findViewById(R.id.button_game);



        /******************************************************
         setOnClickListener::
         START:: Numeros del 0-9
         *****************************************************/

        button_cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "0");
            }
        });//END CERO


        button_nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "9");

            }
        });//END BUTTON NUEVE


        button_ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "8");

            }
        });//END BUTTON OCHO

        button_siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "7");
            }
        });//END BUTTON SIETE


        button_seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "6");

            }
        });//END BUTTON SEIS

        button_cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "5");

            }
        });//END BUTTON CINCO

        button_cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "4");

            }
        });//END BUTTON CUATRO

        button_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "3");

            }
        });//END BUTTON TRES

        button_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "2");

            }
        });//END BUTTON DOS

        button_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + "1");

            }
        });//END BUTTON UNO

        /******************************************************
         setOnClickListener:: NUMEROS
         END:: del 0-9
         *****************************************************/


        /******************************************************
         setOnClickListener:: OPERADORES  ARITMÉTICOS Y OTROS
         START:: CE, +, *, /, %, a^{n}, .
         *****************************************************/

        button_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconca = (TextView) findViewById(R.id.textViewResultado);
                textView.setText(etconca.getText().toString() + ".");
            }
        });//END DECIMAL


        button_clear_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                textView.setText("");

            }
        });//END CE


        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    operador = "+";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");
                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON SUMA.


        button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    operador = "-";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");

                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON RESTA.

        button_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    operador = "/";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");
                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON DIVI.


        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    operador = "*";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");
                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON MULTI.


        button_modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    operador = "%";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");
                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON PORCENTAJE.

        button_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    operador = "expo";
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero1 = Double.parseDouble(etconca.getText().toString());
                    textView.setText("");
                } catch (Exception exception) {

                    exception.getLocalizedMessage();

                }


            }
        });//END BUTTON RESTA.


    button_game.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, GAM.class));

        }
    });


        /******************************************************
         setOnClickListener:: OPERADORES  ARITMÉTICOS Y OTROS
         END:: CE, +, *, /, %, a^{n}, .
         *****************************************************/


        /******************************************************
         setOnClickListener:: Operador de IGUALDA
         En esta parte revisa que los operadores concuerden al hacer
         clic en los botones. devuelve una cadena de caracteres correspondientes
         a la operación aritmética realizando el proceso y retornando
         un resultado al usuario
         *****************************************************/


        button_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    etconca = (TextView) findViewById(R.id.textViewResultado);
                    numero2 = Double.parseDouble(etconca.getText().toString());
                    switch (operador) {

                        case "+":
                            resultado = numero1 + numero2;
                            break;
                        case "-":
                            resultado = numero1 - numero2;
                            break;
                        case "*":
                            resultado = numero1 * numero2;
                            break;
                        case "/":
                            resultado = numero1 / numero2;
                            break;
                        case "%":
                            resultado = (numero1 * numero2) / 100;
                            break;

                        case "expo":
                            resultado = Math.pow(numero1, numero2);


                            break;

                    }//END OPERACIONES ARITMETICAS

                    //Devuelve el resultado a la parte grafica
                    String srtResultado = String.valueOf(resultado);
                    textView.setText(String.valueOf(srtResultado));

                } catch (Exception e) {
                    e.getMessage();
                }


                //srtResultado.replace(".0", ""))


            }

        });//END BUTTON IGUAL.


    }


    //Metodo factorial
    public static Double factorial(Double numero) {
        if (numero == 0)
            return 1D;
        else
            return numero * factorial(numero - 1);
    }


}














