package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }
    public void confirmFood(View v){
        int n=0,n2=0;
        CheckBox ch1=(CheckBox)findViewById(R.id.indian);
        CheckBox ch2=(CheckBox)findViewById(R.id.italian);
        CheckBox ch3=(CheckBox)findViewById(R.id.north);
        CheckBox ch4=(CheckBox)findViewById(R.id.south);
        CheckBox ch5=(CheckBox)findViewById(R.id.mexican);
        CheckBox ch6=(CheckBox)findViewById(R.id.chinese);
        CheckBox ch7=(CheckBox)findViewById(R.id.soft);
        CheckBox ch8=(CheckBox)findViewById(R.id.hard);

        if(ch1.isChecked()){
            dataRepo.foodItems+="\nIndian";
        }
        if(ch2.isChecked()){
            dataRepo.foodItems+="\nItalian";
        }
        if(ch3.isChecked()){
            dataRepo.foodItems+="\nNorthern";
        }
        if(ch4.isChecked()){
            dataRepo.foodItems+="\nSouthern";
        }
        if(ch5.isChecked()){
            dataRepo.foodItems+="\nMexican";
        }
        if(ch6.isChecked()){
            dataRepo.foodItems+="\nChinese";
        }
        if(ch7.isChecked()){
            dataRepo.drinks+="\nSoft Drinks";
        }
        if(ch8.isChecked()){
            dataRepo.drinks+="\nHard Drinks";
        }
    }
}
