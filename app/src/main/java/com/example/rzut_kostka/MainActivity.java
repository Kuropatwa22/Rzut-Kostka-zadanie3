package com.example.rzut_kostka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvResult;
    TextView tvCount;

    int liczbaRzutow = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        tvCount = findViewById(R.id.tvCount);

        Button btnRoll = findViewById(R.id.btnRoll);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnReset = findViewById(R.id.btnReset);

        btnRoll.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.btnRoll) {
            int wynik = random.nextInt(6) + 1;
            liczbaRzutow++;

            tvResult.setText(String.valueOf(wynik));
            tvCount.setText(getString(R.string.count, liczbaRzutow));
        }

        if (id == R.id.btnClear) {
            if (liczbaRzutow == 0) {
                Toast.makeText(this, R.string.error_no_rolls,
                        Toast.LENGTH_SHORT).show();
            } else {
                tvResult.setText("");
            }
        }

        if (id == R.id.btnReset) {
            liczbaRzutow = 0;
            tvResult.setText(R.string.start_result);
            tvCount.setText(getString(R.string.count, liczbaRzutow));
        }
    }
}


