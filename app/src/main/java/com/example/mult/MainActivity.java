package com.example.mult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editTextText);
        num2 = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i =Integer.parseInt(num1.getText().toString());
                Integer j= Integer.parseInt(num2.getText().toString());
                Integer k=i*j;
                Toast.makeText(MainActivity.this, "mult="+k, Toast.LENGTH_SHORT).show();
            }
        });
    }

}