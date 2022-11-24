package com.improve10x.advancedtemplates;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TemplatesService {
    @GET("sriraghuTemplates")
    Call<List<Templates>> fetchTasks();

    @POST("sriraghuTemplates")
    Call<Templates> createTask(@Body Templates templates);
}
