package com.devinotele.huawei.exampleapp.network;


import com.google.gson.JsonObject;

import java.util.HashMap;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface DevinoPushApi {

    @POST("push/api/messages")
    Single<JsonObject> sendPush(@Body HashMap<String, Object>[] body);

}