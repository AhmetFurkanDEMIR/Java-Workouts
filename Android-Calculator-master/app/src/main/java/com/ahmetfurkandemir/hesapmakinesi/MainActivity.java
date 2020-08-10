package com.ahmetfurkandemir.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<sayi1> extends AppCompatActivity {

    EditText sayi1;
    EditText sayi2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 = findViewById(R.id.islem1);
        sayi2 = findViewById(R.id.islem2);
        sonuc = findViewById(R.id.sonuc);


    }


    public void Toplama(View view){


        if(sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){

            sonuc.setText("HATA!");

        }

        else {

            double sayi11 = Double.parseDouble(sayi1.getText().toString());

            double sayi22 = Double.parseDouble(sayi2.getText().toString());

            double toplam = sayi11 + sayi22;

            sonuc.setText("Sonuç = " + toplam);
        }




    }

    public void Cikarma(View view){

        if(sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){

            sonuc.setText("HATA!");

        }

        else {

            double sayi11 = Double.parseDouble(sayi1.getText().toString());

            double sayi22 = Double.parseDouble(sayi2.getText().toString());

            double toplam = sayi11 - sayi22;

            sonuc.setText("Sonuç = " + toplam);
        }

    }

    public  void Carpma(View view){

        if(sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){

            sonuc.setText("HATA!");

        }

        else {

            double sayi11 = Double.parseDouble(sayi1.getText().toString());

            double sayi22 = Double.parseDouble(sayi2.getText().toString());

            double toplam = sayi11 * sayi22;

            sonuc.setText("Sonuç = " + toplam);
        }


    }

    public  void Bolme(View view){

        if(sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("")){

            sonuc.setText("HATA!");

        }

        else {

            double sayi11 = Double.parseDouble(sayi1.getText().toString());

            double sayi22 = Double.parseDouble(sayi2.getText().toString());

            double toplam = sayi11 / sayi22;

            sonuc.setText("Sonuç = " + toplam);
        }


    }


}
