package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Quizes = findViewById(R.id.EditText1);
        final EditText Homework = findViewById(R.id.EditText2);
        final EditText Midterms = findViewById(R.id.EditText3);
        final EditText Final = findViewById(R.id.EditText4);
        final Button cal = findViewById(R.id.button);
        final Button reset = findViewById(R.id.button2);
        final TextView z = findViewById(R.id.textView1);
        final TextView x = findViewById(R.id.textView2);
        final Button next = findViewById(R.id.button3);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(Quizes.getText().toString());
                double num2 = Double.parseDouble(Homework.getText().toString());
                double num3 = Double.parseDouble(Midterms.getText().toString());
                double num4 = Double.parseDouble(Final.getText().toString());

                double result = num1 + num2 + num3 + num4;

                Toast.makeText(MainActivity.this, " your result:"+ result,Toast.LENGTH_LONG).show();


                if (result>90)  { x.setText("A"); }

                else if (result>80)  { x.setText("B"); }

                else if (result>70) { x.setText("C"); }

                else if (result>60) {  x.setText("D"); }

                else  { x.setText("F"); }

            }
        });
         reset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Quizes.setText("");
                 Homework.setText("");
                 Midterms.setText("");
                 Final.setText("");
                 x.setText("");
             }
         });


        }
        public void onclick1 (View V){
            Intent next = new Intent(this,MainActivity2.class);
            startActivity(next);

    }

            }




