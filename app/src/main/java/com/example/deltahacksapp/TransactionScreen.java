package com.example.deltahacksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deltahacksapp.R;
import com.example.deltahacksapp.ui.login.LoginActivity;
import com.example.deltahacksapp.ui.login.LoginViewModel;
import com.example.deltahacksapp.ui.login.LoginViewModelFactory;

public class TransactionScreen extends AppCompatActivity {
    ListView trans;
    String[] receipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_screen);

        Resources res = getResources();

        trans = (ListView) findViewById(R.id.transactionList);
        receipt = res.getStringArray(R.array.transactionList);
    }
}
