package com.example.ui_functional_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class paymentmethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentmethod);
    }
    public void basket(View view) {
        Intent intent = new Intent(this, pay.class);
        startActivity(intent);
    }
}
