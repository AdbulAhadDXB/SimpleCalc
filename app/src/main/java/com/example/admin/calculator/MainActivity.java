package com.example.admin.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numb1, numb2;
    TextView resET;

    Button btnPlus, btnMinus, btnMult, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising the etidText
        numb1 = (EditText) findViewById(R.id.operandEditText1);
        numb2 = (EditText) findViewById(R.id.operandEditText2);
        //initialising the TextView
        resET = (TextView) findViewById(R.id.result);

        //initializing the buttons
        btnPlus = (Button) findViewById(R.id.btnAdd);
        btnMinus = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDev);

          /* //implementing the onClickListener interface
      //setting clickListener for executing the functions
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);  */

       /*
        //using object of interface onClickListener interface
        btnPlus.setOnClickListener(buttonClickListener);
        btnMinus.setOnClickListener(buttonClickListener);
        btnMult.setOnClickListener(buttonClickListener);
        btnDiv.setOnClickListener(buttonClickListener);*/


        //onother way of calling onClickListener
        // setting clickListener for executing the functions
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = numb1.getText().toString();
                String number2 = numb2.getText().toString();
                if (!number1.equals("") && !number2.equals("")) {
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(number2);
                    double result = num1 + num2;
                    //set the result and put on green color
                    resET.setTextColor(Color.GREEN);
                    resET.setText("Result : "+result);
                }else{
                    resET.setTextColor(Color.RED);
                    resET.setText("Two valid input expected!");
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = numb1.getText().toString();
                String number2 = numb2.getText().toString();
                if (!number1.equals("") && !number2.equals("")){
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(number2);
                    double result = num1 - num2;
                    //set the result and put on green color
                    resET.setTextColor(Color.GREEN);
                    resET.setText("Result : "+result);
                }else{
                    resET.setTextColor(Color.RED);
                    resET.setText("Two valid input expected!");
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = numb1.getText().toString();
                String number2 = numb2.getText().toString();
                if (!number1.equals("") && !number2.equals("")){
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(number2);
                    double result = num1 * num2;
                    //set the result and put on green color
                    resET.setTextColor(Color.GREEN);
                    resET.setText("Result : "+result);
                }else {
                    resET.setTextColor(Color.RED);
                    resET.setText("Two valid input expected!");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = numb1.getText().toString();
                String number2 = numb2.getText().toString();
                if (!number1.equals("") && !number2.equals("")){
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(number2);
                    double result = num1 / num2;
                    //set the result and put on green color
                    resET.setTextColor(Color.GREEN);
                    resET.setText("Result : "+result);
                }else{
                    resET.setTextColor(Color.RED);
                    resET.setText("Two valid input expected!");
                }
            }
        });
    }

    /* //creating an object of onClickListener interface
    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //getting the editText input
            String number1 = numb1.getText().toString();
            String number2 = numb2.getText().toString();
            //making sure the EditText are not empty
            if (!number1.equals("") && !number2.equals("")) {
                double num1 = Double.parseDouble(number1);
                double num2 = Double.parseDouble(number2);
                double result = 0;

                //performing the operation as user decide which operation they want
                switch (v.getId()) {
                    case R.id.btnAdd:
                        result = num1 + num2;
                        break;
                    case R.id.btnSub:
                        result = num1 - num2;
                        break;
                    case R.id.btnMul:
                        result = num1 * num2;
                        break;
                    case R.id.btnDev:
                        result = num1 / num2;
                        break;
                    default:
                        break;
                }
                //if the input is valid show the result here and set the color to green
                resET.setTextColor(Color.GREEN);
                resET.setText("Result : "+result);
            }else{
                ////if the input is not valid show this message and set the color to red
                resET.setTextColor(Color.RED);
                resET.setText("Two valid input expected!");
            }
        }
    }; */

   /* //overriding onClickListener interface method
   @Override
    public void onClick(View v) {

        //getting the editText input
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        //making sure the EditText are not empty
        if (!number1.equals("") && !number2.equals("")) {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double result = 0;

            //performing the operation as user decide which operation they want
            switch (v.getId()) {
                case R.id.btnAdd:
                    result = num1 + num2;
                    break;
                case R.id.btnSub:
                    result = num1 - num2;
                    break;
                case R.id.btnMul:
                    result = num1 * num2;
                    break;
                case R.id.btnDev:
                    result = num1 / num2;
                    break;
                    default:
                        break;
            }
            //if the input is valid show the result here and set the color to green
            resET.setTextColor(Color.GREEN);
            resET.setText("Result : "+result);
        }else{
            ////if the input is not valid show this message and set the color to red
            resET.setTextColor(Color.RED);
            resET.setText("Two valid input expected!");
        }

    }
*/
    /*
    //addition formula
    public void add(View v){
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        if (!number1.equals("") && !number2.equals("")) {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double addValue = num1 / num2;
            resET.setText("Result : " + addValue);
        }else{
            resET.setText("Two valid input expected!");
        }
    }
    //subtraction formula
    public void sub(View v){
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        if (!number1.equals("")&& !number2.equals("")) {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double subValue = num1 - num2;
            resET.setText("Result : " + subValue);
        }else{
            resET.setText("Two valid input expected!");
        }    }

    //division formula
    public void div(View v){
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        if (!number1.equals("")&& !number2.equals("")) {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double divValue = num1 / num2;
            resET.setText("Result : " + divValue);
        }else{
            resET.setText("Two valid input expected!");
        }
    }
    //multiplication formula
    public void mul(View v){
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        if (!number1.equals("")&& !number2.equals("")) {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double mulValue = num1 * num2;
            resET.setText("Result : " + mulValue);
        }else{
            resET.setText("Two valid input expected!");
        }
    }
    */
}
