package com.example.irvankalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pertama, kedua, operan;
    Button hitung;
    TextView hasilText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pertama = findViewById(R.id.angka1);
        kedua = findViewById(R.id.angka2);
        operan = findViewById(R.id.operation);
        hitung = findViewById(R.id.hitung);
        hasilText = findViewById(R.id.hasil);
    }

    public void Operasi(View v){
        int inp1 = Integer.parseInt(pertama.getText().toString());
        int inp2 = Integer.parseInt(kedua.getText().toString());
        String op = operan.getText().toString();

        switch (op){
            case "+" :
                int hasil = inp1 + inp2;
                hasilText.setText(String.valueOf(hasil));
                break;
            case "-" :
                int hasill = inp1 - inp2;
                hasilText.setText(String.valueOf(hasill));
                break;
            case "*" :
                int hasilll = inp1 * inp2;
                hasilText.setText(String.valueOf(hasilll));
                break;
            case "/" :
                int hasillll = inp1 / inp2;
                hasilText.setText(String.valueOf(hasillll));
                break;
            default:
                hasilText.setText("Operasi tidak ada");
        }
    }
}