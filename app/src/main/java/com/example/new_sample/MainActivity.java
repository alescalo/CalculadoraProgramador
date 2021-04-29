package com.example.new_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;


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
            @Override
            public void onClick(View view) {
                binaryButtonClicked("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("2");
                else
                    letterButtonClicked("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("3");
                else
                    letterButtonClicked("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("4");
                else
                    letterButtonClicked("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("5");
                else
                    letterButtonClicked("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("6");
                else
                    letterButtonClicked("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("7");
                else
                    letterButtonClicked("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("8");
                else
                    letterButtonClicked("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (modo.equals("dec"))
                    decimalButtonClicked("9");
                else
                    letterButtonClicked("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binaryButtonClicked("0");
            }
        });


        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterButtonClicked("a");
            }
        });

        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterButtonClicked("b");
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterButtonClicked("c");
            }
        });

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterButtonClicked("d");
            }
        });

        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterButtonClicked("e");
            }
        });

        bF.setOnClickListener(new View.OnClickListener() {
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
            @Override
            public void onClick(View view) {

                if(tDec.length()!=0)
                {
                    expression=tDec.getText().toString();
                }
                if(expression.length()==0)
                    expression="0.0";
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
                    tDec.setText("Invalid Expression");
                    expression="";
                    e.printStackTrace();
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
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
            @Override
            public void onClick(View view) {
                if ((tDec.getText().length() > 0)) {
                    if (tDec.getText().length() == 1) {
                        tDec.setText("");
                    } else {
                        CharSequence name = tDec.getText().toString();
                        tDec.setText(name.subSequence(0, name.length() - 1));
                    }
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

    private String getFirstSimbol(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                return s.charAt(i)+"";
            }
        }
        return null;
    }

    private String charArrayToString(char[] arr) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

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

    private boolean esSimbolo(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
    }

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


    public  String decToBin(Integer decVal) {
        return Integer.toBinaryString(decVal);
    }

    public  String decToHex(Integer decVal) {
        return Integer.toHexString(decVal);
    }

    public int hexToDec(String hexVal) {
        return Integer.parseInt(hexVal,16);
    }

    public int binToDec(String binVal) {
        return Integer.parseInt(binVal,2);
    }



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

    private void decimalButtonClicked(String number) {
        ifErrorOnOutput();
        exceedLength();

        tDec.setText(tDec.getText().toString() + number);
    }

    private void disableAllButtons() {

        setNumberButtonsClickable(16, false);
    }

    private void enableButtonsBIN() {
        disableAllButtons();
        setNumberButtonsClickable(2, true);
    }

    private void enableButtonsDEC() {
        disableAllButtons();
        setNumberButtonsClickable(10, true);
    }

    private void enableButtonsHEX() {
        disableAllButtons();
        setNumberButtonsClickable(16, true);
    }

    private void setNumberButtonsClickable(int range, boolean mode) {
        for (int i = 0; i < range; i++) {
            Button button = findViewById(getResources().getIdentifier("button" + i,
                    "id", getApplicationContext().getPackageName()));
            button.setEnabled(mode);
        }
    }


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

    private void operationClicked(String op)
    {
        addOperationToTextView(tBin, op);
        addOperationToTextView(tHex, op);
        addOperationToTextView(tDec, op);
    }

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

}