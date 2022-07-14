package com.example.cryptoexchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Glide.with(MainActivity.this).load(R.raw.imag).into((ImageView) findViewById(R.id.titleImg));


    }


    public void IntroductionCryptoCurrency(View view) {
        Intent intent = new Intent(MainActivity.this, GridCurrenciesActivity.class);
        startActivity(intent);

    }

    public void IntroductionExchanger(View view) {

    }

    public void IntroductionWallets(View view) {

    }

    public void Logout(View view) {
        finish();
    }
}