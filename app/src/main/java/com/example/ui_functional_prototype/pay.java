package com.example.ui_functional_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
    public void pay(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
