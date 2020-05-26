package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GetStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //addName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        addName();
    }
    /**
     * method to add name to text
     */
    public void addName(){
        TextView t= (TextView) findViewById(R.id.hiTag);
        t.setText("Hey! "+dataRepo.name+",\n\nEventRanger Welcomes You!");
    }
    /**
     * method gs
     */
    public void gs(View v){
        Intent i1= new Intent(this,facility.class);
        startActivity(i1);
    }
}
