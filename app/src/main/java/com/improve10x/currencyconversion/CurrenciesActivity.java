package com.improve10x.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.currencyconversion.databinding.ActivityCurrenciesBinding;

public class CurrenciesActivity extends AppCompatActivity {
    private ActivityCurrenciesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrenciesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}