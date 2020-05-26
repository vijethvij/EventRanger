package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class facility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);
    }
    public void ed(View v){
        Intent i=new Intent(this,eventDetails.class);
        startActivity(i);
    }
    public void fb(View v){
        Intent i=new Intent(this,food.class);
        startActivity(i);
    }
    public void d(View v){
        Intent i=new Intent(this,decorations.class);
        startActivity(i);
    }
    public void as(View v){
        Intent i=new Intent(this,aboutUs.class);
        startActivity(i);
    }
    public void os(View v){
        Intent i=new Intent(this,orderSummary.class);
        startActivity(i);
    }
}
