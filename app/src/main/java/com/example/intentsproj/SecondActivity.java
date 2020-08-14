package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    String no1;
    String no2;
    EditText editText1;
    EditText editText2;
    TextView resultView;

    Button add;
    Button minus;
    Button multiply;
    Button division;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();



        editText1 = findViewById(R.id.no1out);
        editText2 = findViewById(R.id.no2out);
         resultView=findViewById(R.id.resultView);
        add=findViewById(R.id.addbtn);
        minus=findViewById(R.id.substractbtn);
        multiply=findViewById(R.id.multiplybtn);
        division=findViewById(R.id.divisionbtn);

        editText1.setText(intent.getStringExtra("number1"));
        editText2.setText(intent.getStringExtra("number2"));

    }

    @Override
    protected void onResume() {
        super.onResume();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1=editText1.getText().toString();
                no2=editText2.getText().toString();
                int value=Integer.parseInt(no1)+Integer.parseInt(no2);
                resultView.setText(no1 +" + "+ no2 +" = "+value);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1=editText1.getText().toString();
                no2=editText2.getText().toString();
                int value=Integer.parseInt(no1)-Integer.parseInt(no2);
                resultView.setText(no1 +" - "+ no2 +" = "+value);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1=editText1.getText().toString();
                no2=editText2.getText().toString();
                int value=Integer.parseInt(no1)*Integer.parseInt(no2);
                resultView.setText(no1 +" * "+ no2 +" = "+value);

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1=editText1.getText().toString();
                no2=editText2.getText().toString();
                int value=Integer.parseInt(no1)/Integer.parseInt(no2);
                resultView.setText(no1 +"/"+ no2 +" = "+value);

            }
        });




















    }
}