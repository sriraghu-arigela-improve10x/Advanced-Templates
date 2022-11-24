package com.improve10x.advancedtemplates;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TemplatesService {
    @GET("sriraghuTemplates")
    Call<List<Templates>> fetchTasks();
}
