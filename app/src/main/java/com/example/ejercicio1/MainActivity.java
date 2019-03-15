package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private TextView tv1;
    private EditText et1;
    private EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        tv1 = findViewById(R.id.t1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.getText().toString());
            }
        });
        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv1.setText(et2.getText().toString());
                return false;
            }
        });
    }
}
