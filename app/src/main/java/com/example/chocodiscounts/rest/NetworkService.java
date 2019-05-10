package com.example.chocodiscounts.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService instance = null;
    private Retrofit nRetrofit;

    public static NetworkService getInstance(){
        if(instance == null){
            instance = new NetworkService();
        }
        return instance;
    }

    private NetworkService(){
        nRetrofit = new Retrofit.Builder()
                .baseUrl("https://chocolife.me/mobileapi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public ChocoApi getChocoApi() {
        return nRetrofit.create(ChocoApi.class);
    }
}
