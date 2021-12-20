package ru.gb.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonMultiplication;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonDivision;
    private Button buttonThree;
    private Button buttonTwo;
    private Button buttonOne;
    private Button buttonAddition;
    private Button buttonClear;
    private Button buttonZero;
    private Button buttonSubstraction;
    private Button buttonResult;

    public static final String DISPLAYVALUE = "DISPLAYVALUE";

    private int displayValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        if (savedInstanceState != null && savedInstanceState.containsKey(DISPLAYVALUE))
        {
            displayValue = savedInstanceState.getInt(DISPLAYVALUE);
        }

        display.setText(String.valueOf(displayValue));
        buttonSeven = findViewById(R.id.button_seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            display.setText(String.valueOf(displayValue) + 7);
        }
    });

        buttonEight = findViewById(R.id.button_eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 8);
            }
        });

        buttonNine = findViewById(R.id.button_nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 9);
            }
        });

        buttonMultiplication = findViewById(R.id.button_multiplication);
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + '*');
            }
        });

        buttonFour = findViewById(R.id.button_four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 4);
            }
        });

        buttonFive = findViewById(R.id.button_five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 5);
            }
        });

        buttonSix = findViewById(R.id.button_six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 6);
            }
        });

        buttonDivision = findViewById(R.id.button_division);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + '/');
            }
        });

        buttonThree = findViewById(R.id.button_three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 3);
            }
        });

        buttonTwo = findViewById(R.id.button_two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 2);
            }
        });

        buttonOne = findViewById(R.id.button_one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 1);
            }
        });

        buttonAddition = findViewById(R.id.button_addition);
        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + '+');
            }
        });

        buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue = 0));
            }
        });

        buttonZero = findViewById(R.id.button_zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + 0);
            }
        });

        buttonSubstraction = findViewById(R.id.button_subtraction);
        buttonSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue) + '-');
            }
        });

        buttonResult = findViewById(R.id.button_result);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(String.valueOf(displayValue));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(DISPLAYVALUE, displayValue);
    }
}