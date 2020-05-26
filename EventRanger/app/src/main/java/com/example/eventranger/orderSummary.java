package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class orderSummary extends AppCompatActivity {
    String sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);
        sum="Client Name: "+dataRepo.name+"\n\nEvent: "+dataRepo.eventTy+"\n\nStart Date: "+dataRepo.date1+"\nCheck in time: "+dataRepo.checkIn+"\n\nEnd Date: "+dataRepo.date2+"\nCheck out time: "+dataRepo.checkOut+"\n\nOrder ID: 1DA12345\n\nFood Items:"+dataRepo.foodItems+"\n\nBeverages: "+dataRepo.drinks+"\n\nNumber of conventioneers: "+dataRepo.ppl;
        TextView v=(TextView) findViewById(R.id.disSummary);
        v.setText(sum);
    }
    public void sendConformationMail(View v){
        String[] ids= new String[]{"example@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL,ids);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Order Summary");
         intent.putExtra(Intent.EXTRA_TEXT, sum);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        startActivity(Intent.createChooser(intent, "Send email..."));
    }
}
