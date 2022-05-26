package com.example.letsgo.interfaces;

import com.example.letsgo.common.ConfigApp;
import com.example.letsgo.model.fcm.FCMResponse;
import com.example.letsgo.model.fcm.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=" + ConfigApp.CLOUD_MESSAGING_SERVER_KEY
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
