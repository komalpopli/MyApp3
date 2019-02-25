package com.example.komal.myapp3;

import com.example.komal.myapp3.Remote.IGoogleApiService;
import com.example.komal.myapp3.Remote.RetrofitClient;

public class Common {
    private static final String Api_Url="http://server-api-7.appspot.com";
    public static IGoogleApiService getGoogleApiService(){
        return RetrofitClient.getClient(Api_Url).create(IGoogleApiService.class);

    }
}
