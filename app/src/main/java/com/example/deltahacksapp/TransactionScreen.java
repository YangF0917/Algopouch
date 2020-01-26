package com.example.deltahacksapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TransactionScreen extends AppCompatActivity {
    ListView trans;
    String[] receipt;
    String[] amount;
    String[] description;
    ArrayAdapter adapter;
    Button[] layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_screen);

        Resources res = getResources();

        trans = (ListView) findViewById(R.id.transactionList);
        receipt = res.getStringArray(R.array.transactionList);
        amount =  res.getStringArray(R.array.transactionList);
        description = res.getStringArray(R.array.transactionList);
        layout = new Button[receipt.length];

        for (int i = 0; i < layout.length; i++){
            layout[i] = new Button(this);
            layout[i].setWidth(100);
            layout[i].setHeight(100);
            layout[i].setTag(i);
            layout[i].setOnClickListener(btnClicked);
            trans.addView(layout[i]);
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, receipt);
        trans.setAdapter(adapter);
        //ReceiptAdapter receiptAdapter = new ReceiptAdapter(this, receipt, amount, description);
        //trans.setAdapter(receiptAdapter);
    }
    View.OnClickListener btnClicked = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Object tag = v.getTag();
            Toast.makeText(getApplicationContext(), "clicked button", Toast.LENGTH_SHORT).show();
        }
    };
}

/*
    Button[] btnWord = new Button[num];
    LinearLayout linear;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamicview);
        test();
    }
    private void test() {
        linear = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < btnWord.length; i++) {
            btnWord[i] = new Button(this);
            btnWord[i].setHeight(50);
            btnWord[i].setWidth(50);
            btnWord[i].setTag(i);
            btnWord[i].setOnClickListener(btnClicked);
            linear.addView(btnWord[i]);
        }
    }
    OnClickListener btnClicked = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Object tag = v.getTag();
            Toast.makeText(getApplicationContext(), "clicked button", Toast.LENGTH_SHORT).show();
        }
    };
*/
