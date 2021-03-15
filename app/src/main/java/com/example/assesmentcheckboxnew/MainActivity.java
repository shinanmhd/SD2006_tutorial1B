package com.example.assesmentcheckboxnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* checkbox items */
    CheckBox chkOne, chkTwo, chkThree, chkFour, chkFive;

    /* button to calculate the total */
    Button btnCalculate;

    /* answer text field */
    TextView txtAnswer;

    /* answer text */
    StringBuilder answer;

    /* integer for total */
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkOne   = findViewById(R.id.chkItemOne);
        chkTwo   = findViewById(R.id.chkItemTwo);
        chkThree = findViewById(R.id.chkItemThree);
        chkFour  = findViewById(R.id.chkItemFour);
        chkFive  = findViewById(R.id.chkItemFive);

        btnCalculate = findViewById(R.id.btnCalculate);

        txtAnswer = findViewById(R.id.txtAnswer);

        answer = new StringBuilder();

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == btnCalculate.getId()) {

                    // reset the output string and the total
                    answer.setLength(0);
                    total = 0;

                    // coffee = mvr 20
                    if (chkOne.isChecked())
                    {
                        total += 20;
                    }

                    // tea = mvr 10
                    if (chkTwo.isChecked())
                    {
                        total += 10;
                    }

                    // sandwich = mvr 35
                    if (chkThree.isChecked())
                    {
                        total += 35;
                    }

                    // ice cream = mvr 30
                    if (chkFour.isChecked())
                    {
                        total += 30;
                    }

                    // juice = mvr 25
                    if (chkFive.isChecked())
                    {
                        total += 25;
                    }

                    // append the text and total to the output string
                    answer.append("Your Total is: ");
                    answer.append(total);

                    // set the TextView to the string
                    txtAnswer.setText(answer);
                }
            }
        });
    }
}