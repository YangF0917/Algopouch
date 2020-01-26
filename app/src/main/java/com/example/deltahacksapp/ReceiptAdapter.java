package com.example.deltahacksapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ReceiptAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] receipt;
    String[] amount;
    String[] description;

    public ReceiptAdapter(Context c, String[] r, String [] a, String[] d){
        receipt = r;
        amount = a;
        description = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return receipt.length;
    }

    @Override
    public Object getItem(int r) {
        return receipt[r];
    }

    @Override
    public long getItemId(int r) {
        return r;
    }

    @Override
    public View getView(int r, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.transaction_layout, null);
        TextView transactionsTextView = (TextView) v.findViewById(R.id.transactionsTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView amountTextView = (TextView) v.findViewById(R.id.amountTextView);

        String trans = receipt[r];
        String desc = description[r];
        String amt = amount[r];

        transactionsTextView.setText(trans);
        descriptionTextView.setText(desc);
        amountTextView.setText(amt);


        return null;
    }
}
