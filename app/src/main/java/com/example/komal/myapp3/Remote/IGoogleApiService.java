package com.example.komal.myapp3.Remote;

import com.example.komal.myapp3.Model.Outbreak;
import com.example.komal.myapp3.Model.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleApiService {
    String BASE_URL="http://server-api-7.appspot.com";
    @GET(".")
    Call<List<Outbreak>> getNearbyOutbreaks();
}
