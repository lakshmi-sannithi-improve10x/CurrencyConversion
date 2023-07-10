package com.improve10x.currencyconversion.network;

import com.improve10x.currencyconversion.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyServiceApi {

    @GET("v1/latest?apikey=wwJuHgd49InoL9jdjEcqlFEYcV9HmDqKB7TwjT6F")
    Call<Data>fetchCurrencies();
}
