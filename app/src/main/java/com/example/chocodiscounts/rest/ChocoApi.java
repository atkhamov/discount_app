package com.example.chocodiscounts.rest;

import com.example.chocodiscounts.rest.entities.ChocoResponse;
import com.example.chocodiscounts.rest.entities.Deal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ChocoApi {
    @GET("v3_3/deals")
    Call<ChocoResponse> getDeals(
            @Query("town_id") int townId,
            @Query("category_id") int categoryId,
            @Query("page") int page
    );
}
