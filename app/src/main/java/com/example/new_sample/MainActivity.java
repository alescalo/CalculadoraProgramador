package com.example.new_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Esta clase define el comportamiento de la calculadora de programador, su funcionalidad y elementos.
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente a partir de la librería de ritik2410
 * @version: 30/04/2021
 * @see <a href = "https://github.com/ritik2410/Elegant_Calculator"/>Elegant_Calculator</a>
 * */

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bA;
    private Button bB;
    private Button bC;
    private Button bD;
    private Button bE;
    private Button bF;

    private Button b_equal;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button b_sub;

    private Button b_clear; //C

    private Button b_plusMinus;
    private Button b_backspace;

    private TextView tBin;
    private TextView tBinMode;
    private TextView tHex;
    private TextView tHexMode;
    private TextView tDec;
    private TextView tDecMode;


    private double aux = Double.NaN;
    private boolean primeraVez = true;

    private int count=0;
    private String expression="";
    private String text="";
    private int result=0;

    String operando2 = "";
    String operando1 = "";

    String modo = "hex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();


        b1.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b1, permite escribir un 1 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                binaryButtonClicked("1");
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b2, permite escribir un 2 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("2");
                else
                    letterButtonClicked("2");
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b3, permite escribir un 3 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("3");
                else
                    letterButtonClicked("3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b4, permite escribir un 4 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("4");
                else
                    letterButtonClicked("4");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b5, permite escribir un 5 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("5");
                else
                    letterButtonClicked("5");
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b6, permite escribir un 6 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("6");
                else
                    letterButtonClicked("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b7, permite escribir un 7 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("7");
                else
                    letterButtonClicked("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b8, permite escribir un 8 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("8");
                else
                    letterButtonClicked("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b9, permite escribir un 9 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("9");
                else
                    letterButtonClicked("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b0, permite escribir un 0 en la calculadora, ya sea en modo hexadecimal, binario o decimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                binaryButtonClicked("0");
            }
        });


        bA.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bA, permite escribir una A en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("a");
            }
        });

        bB.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bB, permite escribir una B en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("b");
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bC, permite escribir una C en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("c");
            }
        });

        bD.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bD, permite escribir una D en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("d");
            }
        });

        bE.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bE, permite escribir una E en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("e");
            }
        });

        bF.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón bF, permite escribir una F en la calculadora hexadecimal
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                letterButtonClicked("f");
            }
        });



        b_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }
                if((!tDec.getText().toString().isEmpty()) && (permiteSimbolo(tDec.getText().toString(),"+"))){
                    operationClicked("+");
                }else{
                    tDec.setText(tDec.getText().toString() + "");
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_sub, permite escribir un - en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                /*
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }else if(tDec.getText().toString().isEmpty()){
                    tDec.setText("-");
                    tHex.setText("-");
                    tBin.setText("-");
                }
                else if(tDec.getText().toString().equals("-")){
                    tDec.setText(tDec.getText().toString() + "");
                }else if(permiteSimbolo(tDec.getText().toString(),"-")){
                    if (tDec.length() != 0) {
                        String s = tDec.getText().toString() + "-";
                        tDec.setText(s);
                        count = 0;
                    } else {
                        tDec.setText("-");
                        tHex.setText("-");
                        tBin.setText("-");
                    }
                }
                */
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }
                if((!tDec.getText().toString().isEmpty()) && (permiteSimbolo(tDec.getText().toString(),"-"))){
                    operationClicked("-");
                }else{
                    tDec.setText(tDec.getText().toString() + "");
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_multi, permite escribir un * en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }
                if((!tDec.getText().toString().isEmpty()) && (permiteSimbolo(tDec.getText().toString(),"*"))){
                    operationClicked("*");
                }else{
                    tDec.setText(tDec.getText().toString() + "");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_divide, permite escribir un / en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }
                if((!tDec.getText().toString().isEmpty()) && (permiteSimbolo(tDec.getText().toString(),"/"))){
                    operationClicked("/");
                }else{
                    tDec.setText(tDec.getText().toString() + "");
                }

            }
        });

        b_plusMinus.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_plusMinus, permite  poner en negativo el resultado actual, borrando el texto invalid expression si estuviese
             * Funciona con la expresión y con el resultado calculado. Pone el opuesto como resultado para seguir calculando desde ahi
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(tDec.getText().equals("Invalid Expression")){
                    tDec.setText("");
                }
                if (!tDec.getText().toString().isEmpty()) {
                    String s = tDec.getText().toString();
                    char arr[] = s.toCharArray();
                    if (arr[0] == '-')
                        tDec.setText(s.substring(1, s.length()));
                    else
                        tDec.setText("-" + s);
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_equal, permite ecalcular el resultado de la expresión escrita, con caso especial por si esta vacía la expresion
             * y empleando el metodo calculate que se ve mas adelante. Si sucede una excepción muestra Invalid Expression
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(tDec.length()!=0||tBin.length()!=0||tHex.length()!=0)
                {
                    expression=tDec.getText().toString();
                }else{
                    expression="";
                }
                if(expression.length()==0)
                    expression="0";
                try
                {
                    //evaluate the expression
                    result=calculate(expression);
                    tDec.setText(result+"");
                    primeraVez = false;
                    aux = result;
                }
                catch (Exception e)
                {
                    try{
                        Double d=Double.parseDouble(expression);
                        if(d instanceof Double){
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& DOUBLE "+d);
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& EXPRESION "+expression);
                            tDec.setText(expression);
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& TDEC "+tDec.getText());
                            int i = (int) Math.round(d);
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ENTERO "+i);
                            tHex.setText(decToHex(i));
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& THEX "+tHex.getText());
                            tBin.setText(decToBin(i));
                            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& TBIN "+tBin.getText());
                        }else{
                            tDec.setText("Invalid Expression");
                            expression="";
                        }

                    }catch(NumberFormatException nfe){
                        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& EXCEPCION ");
                        nfe.printStackTrace();
                    }
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_clear, permite borrar los campos de texto
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                tDec.setText("");
                tBin.setText("");
                tHex.setText("");
                operando2 = "";
                operando1 = "";
            }
        });

        b_backspace.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_backspace, permite eliminar el ultimo caracter escrito en el cuadro de texto de escritura de la expresion, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {

                switch (modo){
                    case "hex":
                        if ((tHex.getText().length() > 0)) {
                            if (tHex.getText().toString().length() == 1) {
                                operando1 = "";
                                tDec.setText("");
                            } else if(getNumSimbolos(tHex.getText().toString().toCharArray()) == 0)
                            {
                                operando1 = tHex.getText().toString();
                                CharSequence name = tHex.getText().toString();
                                tHex.setText(name.subSequence(0, name.length() - 1));
                                if(operando1.length() != 0) {
                                    if(operando1.length() == 1) {
                                        operando1 = "";
                                        tDec.setText("");
                                    } else {
                                        operando1 = operando1.substring(0, operando1.length() - 1);
                                        tDec.setText(String.valueOf(hexToDec(operando1)));
                                        operando1 = decToHex(Integer.valueOf(operando1));
                                        tBin.setText(decToBin(Integer.valueOf(String.valueOf(hexToDec(operando1)))));
                                    }
                                }
                            }else if(getNumSimbolos(tHex.getText().toString().toCharArray()) > 0){
                                CharSequence name = tHex.getText().toString();
                                tHex.setText(name.subSequence(0, name.length() - 1));
                                if (operando2.length() != 0) {
                                    if(operando2.length() == 1) {
                                        operando2 = "";
                                        tDec.setText(String.valueOf(hexToDec(operando1)).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                        tBin.setText(decToBin(Integer.valueOf(String.valueOf(hexToDec(operando1)))).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                    } else {
                                        operando2 = operando2.substring(0, operando2.length() - 1);
                                        tDec.setText(String.valueOf(hexToDec(operando1)).concat(getFirstSimbol(tHex.getText().toString())).concat(String.valueOf(hexToDec(operando2))));
                                        tBin.setText(decToBin(Integer.valueOf(String.valueOf(hexToDec(operando1)))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToBin(Integer.valueOf(String.valueOf(hexToDec(operando2))))));
                                    }
                                } else {
                                    operando1 = tHex.getText().toString().substring(0, tHex.getText().toString().length());
                                    tDec.setText(String.valueOf(hexToDec(operando1)));
                                    operando1 = decToHex(Integer.valueOf(operando1));
                                    tBin.setText(decToBin(Integer.valueOf(String.valueOf(hexToDec(operando1)))));
                                }
                            }
                        }
                        break;
                    case "dec":
                        if ((tDec.getText().length() > 0)) {
                            if (tDec.getText().toString().length() == 1) {
                                tDec.setText("");
                            } else if(getNumSimbolos(tDec.getText().toString().toCharArray()) == 0)
                            {
                                CharSequence name = tDec.getText().toString();
                                tDec.setText(name.subSequence(0, name.length() - 1));
                                if(operando1.length() != 0) {
                                    if(operando1.length() == 1) {
                                        operando1 = "";
                                    } else {
                                        operando1 = operando1.substring(0, operando1.length() - 2);
                                    }
                                }
                            }else if(getNumSimbolos(tDec.getText().toString().toCharArray()) > 0){
                                CharSequence name = tDec.getText().toString();
                                tDec.setText(name.subSequence(0, name.length() - 1));
                                if (operando2.length() != 0) {
                                    if(operando2.length() == 1) {
                                        operando2 = "";
                                        tBin.setText((decToBin(Integer.parseInt(hexToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                        tHex.setText((decToHex(Integer.parseInt(hexToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                    } else {
                                        operando2 = operando2.substring(0, operando2.length() - 2);
                                        tBin.setText((decToBin(Integer.parseInt(hexToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToBin(Integer.parseInt(hexToDec(operando2)+""))));
                                        tHex.setText((decToHex(Integer.parseInt(hexToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToHex(Integer.parseInt(hexToDec(operando2)+""))));
                                    }
                                }
                            }
                        }
                        break;
                    case "bin":
                        if ((tBin.getText().length() > 0)) {
                            if (tBin.getText().toString().length() == 1) {
                                operando1 = "";
                                tDec.setText("");
                            } else if(getNumSimbolos(tBin.getText().toString().toCharArray()) == 0)
                            {
                                operando1 = tBin.getText().toString();
                                CharSequence name = tBin.getText().toString();
                                tBin.setText(name.subSequence(0, name.length() - 1));
                                if(operando1.length() != 0) {
                                    if(operando1.length() == 1) {
                                        operando1 = "";
                                        tDec.setText("");
                                    } else {
                                        operando1 = operando1.substring(0, operando1.length() - 1);
                                        tDec.setText(String.valueOf(binToDec(operando1)));
                                        operando1 = decToBin(Integer.valueOf(operando1));
                                        tHex.setText(decToHex(Integer.valueOf(String.valueOf(binToDec(operando1)))));
                                    }
                                }
                            }else if(getNumSimbolos(tBin.getText().toString().toCharArray()) > 0){
                                CharSequence name = tBin.getText().toString();
                                tBin.setText(name.subSequence(0, name.length() - 1));
                                if (operando2.length() != 0) {
                                    if(operando2.length() == 1) {
                                        operando2 = "";
                                        tDec.setText(String.valueOf(binToDec(operando1)).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                        tHex.setText(decToHex(Integer.valueOf(String.valueOf(binToDec(operando1)))).concat(getFirstSimbol(tHex.getText().toString()))+"");
                                    } else {
                                        operando2 = operando2.substring(0, operando2.length() - 1);
                                        tDec.setText(String.valueOf(binToDec(operando1)).concat(getFirstSimbol(tHex.getText().toString())).concat(String.valueOf(binToDec(operando2))));
                                        tHex.setText(decToHex(Integer.valueOf(String.valueOf(binToDec(operando1)))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToHex(Integer.valueOf(String.valueOf(binToDec(operando2))))));
                                    }
                                } else {
                                    operando1 = tBin.getText().toString().substring(0, tBin.getText().toString().length());
                                    tDec.setText(String.valueOf(binToDec(operando1)));
                                    operando1 = decToBin(Integer.valueOf(operando1));
                                    tHex.setText(decToHex(Integer.valueOf(String.valueOf(binToDec(operando1)))));
                                }
                            }
                        }
                        break;
                }
            }
        });

        tDec.addTextChangedListener(new TextWatcher () {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            /**
             * Listener para mostrar la traducción actual de la expresion escrita hasta el momento, con casos particulares para mostrar la expresión correctamente
             * Si es un número lo muestra tal cual. Se activa cada vez que el texto de la expresión cambia
             * Muestra la expresión correspondiente en los campos en los que no se está escribiendo
             * @param s interfaz de elementos que se puede editar su contenido
             */
            @Override
            public void afterTextChanged(Editable s) {
                if (tDec.getText().toString().length() > 0) {
                    int resultadoParcial = 0;
                    char[] t2CharArray = tDec.getText().toString().toCharArray();
                    char[] t2CharArrayCopia;
                    int numSimbolos = getNumSimbolos(t2CharArray);
                    if (numSimbolos == 0) {
                        tBin.setText(decToBin(Integer.parseInt(tDec.getText().toString())));
                        tHex.setText(decToHex(Integer.parseInt(tDec.getText().toString())));
                        operando1 = tDec.getText().toString();
                    } else if (numSimbolos == 1) {
                        if(operando1.equals("")) {
                            operando1 = tDec.getText().toString().substring(0, tDec.getText().toString().indexOf(getFirstSimbol(tDec.getText().toString())));
                        }
                        char ultimoElemento = s.toString().charAt(s.toString().length() - 1);
                        if (ultimoElemento != '+' && ultimoElemento != '-' && ultimoElemento != '*' && ultimoElemento != '/') {
                            if(modo.equals("dec")) {
                                operando2 += ultimoElemento;
                                tBin.setText((decToBin(Integer.parseInt(hexToDec(operando1) + ""))).concat(getFirstSimbol(tDec.getText().toString())).concat(decToBin(Integer.parseInt(hexToDec(operando2) + ""))));
                                tHex.setText((decToHex(Integer.parseInt(operando1))).concat(getFirstSimbol(tDec.getText().toString())).concat(decToHex(Integer.parseInt(operando2))));
                            }
                        }
                    } else if (numSimbolos == 2) {
                        t2CharArrayCopia = tDec.getText().toString().toCharArray();
                        if (numSimbolos > 1 && esSimbolo(t2CharArray[t2CharArray.length - 1])) {
                            t2CharArrayCopia = eliminarUltimosSimbolos(t2CharArray);
                        }
                        resultadoParcial = calculate(charArrayToString(t2CharArrayCopia));
                        tDec.setText(resultadoParcial + "" + getLastSimbol(tDec.getText().toString()));
                        tBin.setText(decToBin(resultadoParcial) + getLastSimbol(tDec.getText().toString()));
                        tHex.setText(decToHex(resultadoParcial) + getLastSimbol(tDec.getText().toString()));
                    }
                } else if (tDec.getText().toString().length() == 0) {
                    tBin.setText("");
                    tHex.setText("");
                }
            }
        });


        tBinMode.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el text tBinMode, permite cambiar el campo en el que se está escribiendo a binario
             * Cambia los colores de los campos para dejar resaltado en el que se esta escribiendo
             * @param v vista en la que esta el boton
             */
            @Override
            public void onClick(View v) {
                enableButtonsBIN();
                modo = "bin";
                tBin.setBackgroundColor(Color.parseColor("#09C8CF"));
                tBinMode.setBackgroundColor(Color.parseColor("#09C8CF"));

                tHex.setBackgroundColor(Color.parseColor("#C51E1E"));
                tHexMode.setBackgroundColor(Color.parseColor("#C51E1E"));
                tDec.setBackgroundColor(Color.parseColor("#C51E1E"));
                tDecMode.setBackgroundColor(Color.parseColor("#C51E1E"));
            }
        });

        tDecMode.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el text tDecMode, permite cambiar el campo en el que se está escribiendo a decimal
             * Cambia los colores de los campos para dejar resaltado en el que se esta escribiendo
             * @param v vista en la que esta el boton
             */
            @Override
            public void onClick(View v) {
                enableButtonsDEC();
                modo = "dec";
                tDec.setBackgroundColor(Color.parseColor("#09C8CF"));
                tDecMode.setBackgroundColor(Color.parseColor("#09C8CF"));

                tHex.setBackgroundColor(Color.parseColor("#C51E1E"));
                tHexMode.setBackgroundColor(Color.parseColor("#C51E1E"));
                tBin.setBackgroundColor(Color.parseColor("#C51E1E"));
                tBinMode.setBackgroundColor(Color.parseColor("#C51E1E"));
            }
        });

        tHexMode.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el text tHexMode, permite cambiar el campo en el que se está escribiendo a hexadecimal
             * Cambia los colores de los campos para dejar resaltado en el que se esta escribiendo
             * @param v vista en la que esta el boton
             */
            @Override
            public void onClick(View v) {
                enableButtonsHEX();
                modo = "hex";
                tHex.setBackgroundColor(Color.parseColor("#09C8CF"));
                tHexMode.setBackgroundColor(Color.parseColor("#09C8CF"));

                tDec.setBackgroundColor(Color.parseColor("#C51E1E"));
                tDecMode.setBackgroundColor(Color.parseColor("#C51E1E"));
                tBin.setBackgroundColor(Color.parseColor("#C51E1E"));
                tBinMode.setBackgroundColor(Color.parseColor("#C51E1E"));
            }
        });

    }

    /**
     * Método getLastSimbol devuelve el último símbolo de operación
     * @param s es la propia expresión
     * @return string con el símbolo en cuestion
     */
    private String getLastSimbol(String s) {
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                position = i;
            }
        }
        if(position != -1)
            return s.charAt(position)+"";
        return null;
    }

    /**
     * Método que analiza si es válido escribir el símbolo sim a continuación en la expresión, caso especial para el - ya que es el único que puede ir detrás de otro símbolo.
     * @param s es la propia expresión
     * @param sim simbolo en concretoq ue se va a analizar si es válido sintácticamente en la expresion
     * @return true si el símbolo se puede escribir a continuación y false si sería sintaxis incorrecta
     */
    private boolean permiteSimbolo(String s, String sim){
        char[] arr = s.toCharArray();
        int n=arr.length-1;
        boolean valido=true;
        if (esSimbolo(arr[n])) {
            if(!sim.equals("-")){
                valido=false;
            }else{
                if(esSimbolo(arr[n-1])){
                    valido=false;
                }
            }
        }
        return valido;
    }

    /**
     * Método getFirstSimbol devuelve el primer símbolo de operación
     * @param s es la propia expresión
     * @return string con el símbolo en cuestion
     */
    private String getFirstSimbol(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                return s.charAt(i)+"";
            }
        }
        return null;
    }

    /**
     * Método que transforma un array de caracteres en una string
     * @param arr array de caracteres a transformar
     * @return string correspondiente al array de caracteres
     */
    private String charArrayToString(char[] arr) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    /**
     * Método que calcula el número de símbolos en un array de caracteres, correspondiente a la expresión. El - (marca de numero negativo) inicial no se cuenta
     * @param arr es la propia expresión
     * @return int con el numero de símbolos (sin contar el negativo inicial si lo hubiere)
     */
    private int getNumSimbolos(char[] arr) {
        int position = 0;
        int contador = 0;
        boolean anterior = false;
        if (arr[0] == '-') {
            position++;
        }
        for (int i = position; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
                if (!anterior) {
                    contador++;
                    anterior = true;
                }
            }
            anterior = false;
        }
        return contador;
    }

    /**
     * Método que analiza si el caracter en cuestión es uno de los símbolos de las operaciones (+,-,*,/)
     * @param caracter caracter a analizar
     * @return true si es un símbolo de operación y false en caso contrario
     */
    private boolean esSimbolo(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
    }

    /**
     * Método que elimina de la expresión los ultimos simbolos que finalizan la expresión(18*9+-, en este caso deja 18*9)
     * Se emplea para crear una operación válida para el cálculo automático del resultado provisional
     * @param arr es la propia expresión
     * @return array de caracteres con la expresión válida para ser calculada
     */
    private char[] eliminarUltimosSimbolos(char[] arr) {
        int n = arr.length;
        while (esSimbolo(arr[n - 1])) {
            n--;
        }
        char[] arrReturn = new char[n];

        for (int i = 0; i < n; i++) {
            arrReturn[i] = arr[i];
        }

        return arrReturn;
    }

    /**
     * Método que convierte un numero decimal a su equivalente binario
     * @param decVal es el numero decimal a convertir
     * @return string de la conversión a binario
     */
    public  String decToBin(Integer decVal) {
        return Integer.toBinaryString(decVal);
    }

    /**
     * Método que convierte un numero decimal a su equivalente hexadecimal
     * @param decVal es el numero decimal a convertir
     * @return string de la conversión a hexadecimal
     */
    public  String decToHex(Integer decVal) {
        return Integer.toHexString(decVal);
    }

    /**
     * Método que convierte un numero hexadecimal a su equivalente decimal
     * @param hexVal es el numero hexadecimal a convertir
     * @return int de la conversión a decimal
     */
    public int hexToDec(String hexVal) {
        if (hexVal.isEmpty())
            return 0;
        else
            return Integer.parseInt(hexVal,16);
    }

    /**
     * Método que convierte un numero binario a su equivalente decimal
     * @param binVal es el numero binario a convertir
     * @return int de la conversión a decimal
     */
    public int binToDec(String binVal) {
        if (binVal.isEmpty())
            return 0;
        else
            return Integer.parseInt(binVal,2);
    }


    /**
     * Método que inicializa los botones de la vista, original de la librería
     */
    private void viewSetup() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);

        bA = findViewById(R.id.button10);
        bB = findViewById(R.id.button11);
        bC = findViewById(R.id.button12);
        bD = findViewById(R.id.button13);
        bE = findViewById(R.id.button14);
        bF = findViewById(R.id.button15);

        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);

        b_clear = findViewById(R.id.button_clear);

        b_plusMinus = findViewById(R.id.button_plusMinus);
        b_backspace = findViewById(R.id.button_backspace);

        tBin = findViewById(R.id.tBin);
        tBinMode = findViewById(R.id.tBinMode);
        tHex = findViewById(R.id.tHex);
        tHexMode = findViewById(R.id.tHexMode);
        tDec = findViewById(R.id.tDec);
        tDecMode = findViewById(R.id.tDecMode);
    }


    /**
     * Método original de la librería
     */
    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (tBin.getText().toString().equals("Error")) {
            tBin.setText("");
        }
        if (tDec.getText().toString().equals("Error")) {
            tDec.setText("");
        }
        if (tHex.getText().toString().equals("Error")) {
            tHex.setText("");
        }
    }

    /**
     * Método que añade la letra pulsado al campo hexadecimal. Hace las comprobaciones pertinentes para colocar el equivalente en
     * los otros dos campos
     * @param letter letra del boton hexadecimal que se ha pulsado
     */
    private void letterButtonClicked(String letter) {
        ifErrorOnOutput();
        exceedLength();
        if(modo.equals("hex")) {
            tHex.setText(tHex.getText().toString() + letter);
            if(getNumSimbolos(tHex.getText().toString().toCharArray()) == 0) {
                tDec.setText(hexToDec(tHex.getText().toString()) + "");
                operando1 = tHex.getText().toString();

            } else if (getNumSimbolos(tHex.getText().toString().toCharArray()) == 1) {
                operando2 += letter;
                tDec.setText((hexToDec(operando1) + "").concat(getFirstSimbol(tHex.getText().toString())).concat(hexToDec(operando2)+""));
                tBin.setText((decToBin(Integer.parseInt(hexToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToBin(Integer.parseInt(hexToDec(operando2)+""))));
            }
        } else {
            tDec.setText(tDec.getText().toString() + String.valueOf(hexToDec(letter)));
        }
    }

    /**
     * Método que añade el numero pulsado al campo binario. Hace las comprobaciones pertinentes para colocar el equivalente en
     * los otros dos campos
     * @param number numero del boton binario que se ha pulsado
     */
    private void binaryButtonClicked(String number) {
        ifErrorOnOutput();
        exceedLength();

        if(modo.equals("bin")) {
            tBin.setText(tBin.getText().toString() + number);
            if(getNumSimbolos(tBin.getText().toString().toCharArray()) == 0) {
                tDec.setText(binToDec(tBin.getText().toString()) + "");


            } else if (getNumSimbolos(tHex.getText().toString().toCharArray()) == 1) {
                operando1 = tBin.getText().toString().substring(0, tBin.getText().toString().indexOf(getFirstSimbol(tBin.getText().toString())));
                operando2 += number;
                tDec.setText((binToDec(operando1) + "").concat(getFirstSimbol(tBin.getText().toString())).concat(binToDec(operando2)+""));
                tHex.setText((decToHex(Integer.parseInt(binToDec(operando1)+""))).concat(getFirstSimbol(tHex.getText().toString())).concat(decToHex(Integer.parseInt(binToDec(operando2)+""))));
            }
        } else {
            tDec.setText(tDec.getText().toString() + String.valueOf(hexToDec(number)));
        }
    }

    /**
     * Método que añade el numero pulsado al campo decimal
     * @param number numero del boton decimal que se ha pulsado
     */
    private void decimalButtonClicked(String number) {
        ifErrorOnOutput();
        exceedLength();

        tDec.setText(tDec.getText().toString() + number);
    }

    /**
     * Método que desactiva los botones
     */
    private void disableAllButtons() {

        setNumberButtonsClickable(16, false);
    }

    /**
     * Método que activa los botones binarios
     */
    private void enableButtonsBIN() {
        disableAllButtons();
        setNumberButtonsClickable(2, true);
    }

    /**
     * Método que activa los botones decimales
     */
    private void enableButtonsDEC() {
        disableAllButtons();
        setNumberButtonsClickable(10, true);
    }

    /**
     * Método que activa los botones hexadecimales
     */
    private void enableButtonsHEX() {
        disableAllButtons();
        setNumberButtonsClickable(16, true);
    }

    /**
     * Método que activa los botones en un rango dado
     * @param range es el rango de botones a activar
     * @param mode es el modo, true es activar, false desactivar
     */
    private void setNumberButtonsClickable(int range, boolean mode) {
        for (int i = 0; i < range; i++) {
            Button button = findViewById(getResources().getIdentifier("button" + i,
                    "id", getApplicationContext().getPackageName()));
            button.setEnabled(mode);
        }
    }


    /**
     * Método original de la librería
     */
    // Make text small if too many digits.
    private void exceedLength() {
        if (tBin.getText().toString().length() > 10) {
            tBin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        if (tDec.getText().toString().length() > 10) {
            tDec.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        if (tHex.getText().toString().length() > 10) {
            tHex.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }

    /**
     * Método que se ejecuta cuando se hace click en un boton de operacion, añade el simbolo a la expresión
     * @param op es el símbolo a añadir
     */
    private void operationClicked(String op)
    {
        addOperationToTextView(tBin, op);
        addOperationToTextView(tHex, op);
        addOperationToTextView(tDec, op);
    }

    /**
     * Método que añade la operación al textview correspondiente
     * @param t1 es el textview donde se tiene que escribir
     * @param op es el símbolo a añadir
     */
    private void addOperationToTextView(TextView t1, String op) {
        if (t1.length() != 0) {
            t1.setText(t1.getText() + op);
            count = 0;
        } else {
            String text = t1.getText().toString();
            if (text.length() > 0) {
                String newText = text.substring(0, text.length() - 1) + op;
                t1.setText(newText);
            }
        }
    }

    /**
     * Método que calcula el resultado de una expresión dada, tiene en cuenta distintos casos dependiendo del tipo de operación
     * Tiene en cuenta si un número es negativo, le cambia el signo si es necesario y calcula la expresión al completo
     * @param expression es la propia expresión
     * @return double con el resultado de la expresión redondeado a 5 cifras decimales
     */
    private int calculate(String expression) {
        String op1String ="";
        String op2String ="";

        int op1 = 0;
        int op2 = 0;

        char simbol = '+';
        boolean neg = false;

        int position = 0;
        char arr[]=expression.toCharArray();

        boolean primeraVez = true;
        boolean cambiarSigno = false;

        if(arr[0]=='-')
            neg = true;

        while ((arr[position] != '+' && arr[position] != '-' && arr[position] != '*' && arr[position] != '/') || primeraVez) {
            op1String += arr[position];
            position++;
            primeraVez = false;
        }
        simbol = arr[position];
        if(arr[position + 1] == '-') {
            cambiarSigno = true;
            position++;
        }

        //if(neg) {
          //  op1String = "-" + op1String;
        //}

        for (int i = position + 1; i < arr.length; i++) {
            if(arr[i] != '+' && arr[i] != '-' && arr[i] != '*' && arr[i] != '/') {
                op2String += arr[i];
            } else {
                op1 = Integer.valueOf(op1String);
                op2 = Integer.valueOf(op2String);
                if(cambiarSigno) {
                    op2 = op2 * (-1);
                    cambiarSigno = false;
                }

                switch (simbol) {
                    case '+': {
                        op1 += op2;
                        break;
                    }
                    case '-': {
                        op1 -= op2;
                        break;
                    }
                    case '*': {
                        op1 = op1 * op2;
                        break;
                    }
                    case '/': {
                        op1 = op1 / op2;
                        break;
                    }
                }
                simbol = arr[i];
                if(arr[i + 1] == '-') {
                    cambiarSigno = true;
                    i++;
                }
                position = i;
                op2String ="";
                op1String = String.valueOf(op1);

            }
        }

        op1 = Integer.valueOf(op1String);
        op2 = Integer.valueOf(op2String);

        if(cambiarSigno) {
            op2 = op2 * (-1);
            cambiarSigno = false;
        }
        switch (simbol) {
            case '+': {
                op1 += op2;
                break;
            }
            case '-': {
                op1 -= op2;
                break;
            }
            case '*': {
                op1 = op1 * op2;
                break;
            }
            case '/': {
                op1 = op1 / op2;
                break;
            }

        }

        operando1 = "";
        operando2 = "";
        return op1;
    }

    public boolean haySimbolo(String expression){

        for (char i : expression.toCharArray()){

            if(i == '+' || i == '-' || i == '/' || i == '*')
                return true;

        }

        return false;

    }

}