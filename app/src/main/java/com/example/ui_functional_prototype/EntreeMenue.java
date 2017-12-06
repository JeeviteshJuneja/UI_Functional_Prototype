package com.example.ui_functional_prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EntreeMenue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree_menue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void gotocheckout(View view){
        if(MySingletonClass.getInstance().getValue() == true) {
            Intent intent = new Intent(this, ViewCart.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, EmptyCart.class);
            startActivity(intent);
        }
    }
    public void gotoBeefSteak(View view){
        Intent intent = new Intent(this,BeefSteak.class);
        startActivity(intent);
    }
}
