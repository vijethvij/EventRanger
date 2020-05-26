package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class decorations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorations);
    }
    /**
     * method to confirm deco
     */
    public void confirmDeco(View vi){
        Switch s= (Switch) findViewById(R.id.decor);
        if(s.isEnabled()){
            TextView v= findViewById(R.id.decoText);
            v.setText("Our Decorator will contact you soon.");
        }
    }
}
