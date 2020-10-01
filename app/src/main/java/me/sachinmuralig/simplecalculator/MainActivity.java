package me.sachinmuralig.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import me.sachinmuralig.utils.MathFunctions;

public class MainActivity extends AppCompatActivity {

    private EditText editTextOperandOne;
    private EditText editTextOperandTwo;
    private TextView textViewResult;

    private Button btnAdd;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUiElements();
        addActionsToCalculatorButtons();
    }

    private void initializeUiElements() {
        // Get references of UI Elements from the Layout to the java code
        editTextOperandOne = findViewById(R.id.editTextOperandOne);
        editTextOperandTwo = findViewById(R.id.editTextOperandTwo);
        textViewResult = findViewById(R.id.textResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
    }

    private void addActionsToCalculatorButtons() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = MathFunctions.add(editTextOperandOne.getText().toString(),
                        editTextOperandTwo.getText().toString());
                setResult(result);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = MathFunctions.subtract(editTextOperandOne.getText().toString(),
                        editTextOperandTwo.getText().toString());
                setResult(result);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = MathFunctions.multiply(editTextOperandOne.getText().toString(),
                        editTextOperandTwo.getText().toString());
                setResult(result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = MathFunctions.divide(editTextOperandOne.getText().toString(),
                        editTextOperandTwo.getText().toString());
                setResult(result);
            }
        });
    }

    private void setResult(double result) {
        textViewResult.setText(String.format("%.3f", result));
    }
}