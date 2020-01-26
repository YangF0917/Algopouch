package com.example.deltahacksapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TransactionScreen extends AppCompatActivity {
    ListView trans;
    String[] receipt;
    String[] amount;
    String[] description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_screen);

        Resources res = getResources();

        trans = (ListView) findViewById(R.id.transactionList);
        receipt = res.getStringArray(R.array.transactionList);
        amount =  res.getStringArray(R.array.transactionList);
        description = res.getStringArray(R.array.transactionList);

        ReceiptAdapter receiptAdapter = new ReceiptAdapter(this, receipt, amount, description);
        trans.setAdapter(receiptAdapter);

    }
}


