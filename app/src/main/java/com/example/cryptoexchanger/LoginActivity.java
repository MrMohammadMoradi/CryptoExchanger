package com.example.cryptoexchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast.makeText(LoginActivity.this, " ** به برنامه من خوش آمدید ** ", Toast.LENGTH_LONG).show();


    }
    public void LoginToAccount(View view) {
        EditText usernameEDT = (EditText) findViewById(R.id.usernameEDT);
        EditText passwordEDT = (EditText) findViewById(R.id.passwordEDT);
        String username = String.valueOf(usernameEDT.getText());
        String password = String.valueOf(passwordEDT.getText());

        if ( username.equals("admin"))
        {
            if (password.equals("1234"))
            {
                Toast.makeText(LoginActivity.this, "نام کاربری و رمز عبور صحیح است", Toast.LENGTH_SHORT).show();

                CheckBox checkBox = (CheckBox) findViewById(R.id.checkForSaveLogin);

                if (checkBox.isChecked() == true) {

                }
                else {
                    SharedPreferences sp = getSharedPreferences("MyLoginInfo", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("USERNAME", username);
                    editor.putString("PASSWORD", password);
                    editor.apply();
                }


                Intent i  = new Intent(LoginActivity.this, MainActivity.class);
                i.putExtra("USERNAME", "admin");
                i.putExtra("PASSWORD", "1234");
                i.putExtra("isLoggedIn", true);
                startActivity(i);

            }
            else
            {
                Toast.makeText( LoginActivity.this, "رمز عبور اشتباه است", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(LoginActivity.this, "نام کاربری اشتباه است", Toast.LENGTH_SHORT).show();
        }


    }

}