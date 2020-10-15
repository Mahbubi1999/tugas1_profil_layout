package com.example.mahbubirosyadi_profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void masuk(View view) {
        Intent a =  new Intent (MainActivity.this,masuk.class);
        startActivity(a);
    }
}