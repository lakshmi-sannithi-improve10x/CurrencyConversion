package com.improve10x.currencyconversion;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.improve10x.currencyconversion.model.Currency;
import com.improve10x.currencyconversion.network.CurrencyApi;
import com.improve10x.currencyconversion.network.CurrencyServiceApi;

import java.io.IOException;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCurrencies() throws IOException {
        CurrencyServiceApi currencyServiceApi = new CurrencyApi().createCurrencyServiceApi();
        Call<Currency> call = currencyServiceApi.fetchCurrencies("wwJuHgd49InoL9jdjEcqlFEYcV9HmDqKB7TwjT6F");
        Currency currency = call.execute().body();
        assertNotNull(currency);
        System.out.println(new Gson().toJson(currency));
    }
}