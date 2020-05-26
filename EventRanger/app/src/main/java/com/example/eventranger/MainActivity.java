package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * method to pass to getStarted page
     */
    public void login(View v){
       // collectName();
        EditText ob= (EditText) findViewById(R.id.nameTag);
        dataRepo.name=ob.getText().toString();
        Intent i=new Intent(this,GetStarted.class);
        startActivity(i);
    }
}
