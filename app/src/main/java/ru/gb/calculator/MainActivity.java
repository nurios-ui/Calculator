package ru.gb.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private MaterialButton buttonSeven;
    private MaterialButton buttonEight;
    private MaterialButton buttonNine;
    private MaterialButton buttonMultiplication;
    private MaterialButton buttonFour;
    private MaterialButton buttonFive;
    private MaterialButton buttonSix;
    private MaterialButton buttonDivision;
    private MaterialButton buttonThree;
    private MaterialButton buttonTwo;
    private MaterialButton buttonOne;
    private MaterialButton buttonAddition;
    private MaterialButton buttonClear;
    private MaterialButton buttonZero;
    private MaterialButton buttonSubstraction;
    private MaterialButton buttonResult;

    public static final String DISPLAYVALUE = "DISPLAYVALUE";

    private int displayValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        if (savedInstanceState != null && savedInstanceState.containsKey(DISPLAYVALUE)) {
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