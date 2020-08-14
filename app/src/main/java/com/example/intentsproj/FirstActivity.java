package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.View.*;

public class FirstActivity extends AppCompatActivity {
//create an object of button

    Button btn;
    String no1;

    String no2;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn= findViewById(R.id.okbtn);



    }

    @Override
    protected void onResume() {
        super.onResume();


        //set on click Listner
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";

                //Display toaster
                int duration = Toast.LENGTH_SHORT; //How long the toastmessage will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 100);
                toast.show();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                editText1=(EditText)findViewById(R.id.number1input);
                editText2=(EditText)findViewById(R.id.number2input);

                no1=editText1.getText().toString();
                no2=editText2.getText().toString();

                intent.putExtra("number1",no1);
                intent.putExtra("number2",no2);


                startActivity(intent);


            }
        });







    }
}