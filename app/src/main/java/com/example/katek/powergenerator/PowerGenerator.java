package com.example.katek.powergenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import java.text.NumberFormat;


public class PowerGenerator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_generator);
        Button button2 = findViewById(R.id.equal2);
        Button button3 = findViewById(R.id.equal3);
        Button button4 = findViewById(R.id.equal4);
        Button button5 = findViewById(R.id.equal5);
        final TextView text2 = findViewById(R.id.text2);
        final TextView text3 = findViewById(R.id.text3);
        final TextView text4 = findViewById(R.id.text4);
        final TextView text5 = findViewById(R.id.text5);
        final EditText pow2 = findViewById(R.id.pow2);
        final EditText pow3 = findViewById(R.id.pow3);
        final EditText pow4 = findViewById(R.id.pow4);
        final EditText pow5 = findViewById(R.id.pow5);
        final TextView result2 = findViewById(R.id.result2);
        final TextView result3 = findViewById(R.id.result3);
        final TextView result4 = findViewById(R.id.result4);
        final TextView result5 = findViewById(R.id.result5);

        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        final double base2 = Double.parseDouble(text2.getText().toString());
                        final double power2 = Double.parseDouble(pow2.getText().toString());
                        double result = Math.pow(base2, power2);
                        String results = String.format("%.2f",result);
                        result2.setText(results);
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        final double base3 = Double.parseDouble(text3.getText().toString());
                        final double power3 = Double.parseDouble(pow3.getText().toString());
                        double result = Math.pow(base3, power3);
                        String results = String.format("%.2f",result);
                        result3.setText(results);
                    }
                }
        );

        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        final double base4 =Double.parseDouble(text4.getText().toString());
                        final double power4 = Double.parseDouble(pow4.getText().toString());
                        double result = Math.pow(base4, power4);
                        String results = String.format("%.2f",result);
                        result4.setText(results);
                    }
                }
        );

        button5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        final double base5 =Double.parseDouble(text5.getText().toString());
                        final double power5 = Double.parseDouble(pow5.getText().toString());
                        double result = Math.pow(base5, power5);
                        String results = String.format("%.2f",result);
                        result5.setText(results);
                    }
                }
        );

    }

}


