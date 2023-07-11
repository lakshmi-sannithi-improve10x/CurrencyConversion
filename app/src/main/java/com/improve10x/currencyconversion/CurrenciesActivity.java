package com.improve10x.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.improve10x.currencyconversion.databinding.ActivityCurrenciesBinding;

public class CurrenciesActivity extends AppCompatActivity {
    private ActivityCurrenciesBinding binding;
    private String[] currencies = {"australianDollar(AUD)","bulgarianLev(BGN)","brazilianReal(BRL)"};
    private ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrenciesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        binding.currencySp.setAdapter(arrayAdapter);
        binding.convertedCurrencySp.setAdapter(arrayAdapter);
    }

    private void setupAdapter() {
        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,currencies);
    }
}