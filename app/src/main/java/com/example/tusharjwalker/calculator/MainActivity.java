package com.example.tusharjwalker.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double first, second, result;
    boolean addition = false,
            subtraction = false,
            multiplication = false,
            division = false;

    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        textview = findViewById(R.id.textview);

        textview.setText("");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("9");
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("8");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("7");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("6");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("5");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("4");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("3");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("2");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("1");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append(".");

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.append("0");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    second = Double.valueOf(textview.getText().toString());
                    if (addition){
                        result = first + second;
                        textview.setText("" + result);
                    }
                    if (subtraction){
                        result = first - second;
                        textview.setText("" + result);
                    }
                    if (multiplication){
                        result = first * second;
                        textview.setText("" + result);
                    }
                    if (division){
                        result = first / second;
                        textview.setText("" + result);
                    }
                }catch (Exception e){}


            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                String str = textview.getText().toString();
                textview.setText(null);
                textview.setText(str.substring(0,str.length()-1));}
                catch(Exception e){}

            }
        });
        button12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textview.setText(null);
                return true;
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first = Double.valueOf(textview.getText().toString());
                    textview.setText(null);
                    addition = false;
                    subtraction = false;
                    multiplication = true;
                    division = false;

                }catch (Exception e){}

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first = Double.valueOf(textview.getText().toString());
                    textview.setText(null);
                    addition = false;
                    subtraction = false;
                    multiplication = false;
                    division = true;

                }catch (Exception e){}

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first = Double.valueOf(textview.getText().toString());
                    textview.setText(null);
                    addition = false;
                    subtraction = true;
                    multiplication = false;
                    division = false;

                }catch (Exception e){}

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first = Double.valueOf(textview.getText().toString());
                    textview.setText(null);
                    addition = true;
                    subtraction = false;
                    multiplication = false;
                    division = false;

                }catch (Exception e){}

            }
        });
    }
}
