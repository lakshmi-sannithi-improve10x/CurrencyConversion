package com.improve10x.currencyconversion.network;

import com.improve10x.currencyconversion.model.Currency;
import com.improve10x.currencyconversion.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyServiceApi {

    @GET("v1/latest")
    Call<Currency>fetchCurrencies(@Query("apikey") String apikey);
}
