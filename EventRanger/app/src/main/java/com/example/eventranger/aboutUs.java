package com.example.eventranger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class aboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
    public void sendMail(View v) {
        String[] ids= new String[]{"vijethvijviji@gmail.com"}; //,"vijethvasihnav@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL,ids);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello, EventRanger");
       // intent.putExtra(Intent.EXTRA_TEXT, str);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        startActivity(Intent.createChooser(intent, "Send email..."));
    }
    public void dialPhoneNumber(View view) {
        String pno="6362723573";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + pno));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
