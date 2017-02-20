package com.example.baseexamplenfc;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent startIntent = getIntent();
        if (startIntent != null && startIntent.getAction().equals(NfcAdapter.ACTION_TECH_DISCOVERED)) {
            onNewIntent(startIntent);
        }
    }


    @Override
    protected void onNewIntent(Intent intent) {
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT);
        //super.onNewIntent(intent);

    }

    private  void processIntent(Intent intent){

    }

}



