package com.test.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btndivide,btnmultiply;
    Button btnmod,btnequalto,btnbracket1,btnbracket2,btndot,btnzero,btnclear;
    TextView textenter;
    EditText ed1;
    float res1, res2;
    boolean Add, Minus,Mul,Div;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnzero = findViewById(R.id.btnzero);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btndivide = findViewById(R.id.btndivide);
        btnmultiply = findViewById(R.id.btnmultiply);
        btnmod = findViewById(R.id.btnmod);
        btnequalto = findViewById(R.id.btnequalto);
        btnclear = findViewById(R.id.btnclear);
        btnbracket1 = findViewById(R.id.btnbracket1);
        btnbracket2 = findViewById(R.id.btnbracket2);
        btndot = findViewById(R.id.btndot);
        ed1 = findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            private BreakIterator edt1;

            @Override
            public void onClick(View v) {
                edt1.setText(ed1.getText()+ ".");
            }
        });
        
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");

            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");

            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Add = true;
                    ed1.setText(null);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Minus = true;
                    ed1.setText(null);
                }
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Mul= true;
                    ed1.setText(null);
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Div= true;
                    ed1.setText(null);
                }
            }
        });
        btnequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText() + "");
                if (Add == true) {
                    ed1.setText(res1 + res2 + "");
                    Add = false;
                }
                if (Minus == true) {
                    ed1.setText(res1 - res2 + "");
                    Minus = false;
                }
                if (Div == true) {
                    ed1.setText(res1 / res2 + "");
                    Div= false;
                }
                if (Mul== true) {
                    ed1.setText(res1 * res2 + "");
                    Mul = false;
                }


            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
       
    }
}