package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class eventDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
    }
    /**
     * method to get event type
     */
    public void confirmDetails(View v){
        Spinner ed1= (Spinner) findViewById(R.id.eventType);
        dataRepo.eventTy=ed1.getSelectedItem().toString();

        EditText ed2= (EditText) findViewById(R.id.startDate);
        dataRepo.date1=ed2.getText().toString();

        EditText ed3= (EditText) findViewById(R.id.startTime);
        dataRepo.checkIn=ed3.getText().toString();

        EditText ed4= (EditText) findViewById(R.id.endDate);
        dataRepo.date2=ed4.getText().toString();

        EditText ed5= (EditText) findViewById(R.id.endTime);
        dataRepo.checkOut=ed5.getText().toString();

        EditText ed6= (EditText) findViewById(R.id.headCount);
        dataRepo.ppl=ed6.getText().toString();

    }

}

