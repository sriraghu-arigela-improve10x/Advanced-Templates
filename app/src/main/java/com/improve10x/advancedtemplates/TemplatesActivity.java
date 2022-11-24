package com.improve10x.advancedtemplates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Templates> templatesId;
    public  RecyclerView templateRv;
    public TemplatesAdapter templatesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        handleAddBtn();
        setData();
        advanceTemplatesRv();
    }

    @Override
    protected void onResume() {
        super.onResume();
        fetchTasks();
    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TemplatesAddBtnActivity.class);
            startActivity(intent);
        });
    }

    public void fetchTasks() {
        TemplatesApi templatesApi = new TemplatesApi();
        TemplatesService templatesService = templatesApi.createTemplatesService();
        Call<List<Templates>> call = templatesService.fetchTasks();
        call.enqueue(new Callback<List<Templates>>() {
            @Override
            public void onResponse(Call<List<Templates>> call, Response<List<Templates>> response) {
                List<Templates> lists = response.body();
                templatesAdapter.setData(lists);
            }

            @Override
            public void onFailure(Call<List<Templates>> call, Throwable t) {
                Toast.makeText(TemplatesActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void advanceTemplatesRv() {
        templateRv = findViewById(R.id.templates_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templatesAdapter = new TemplatesAdapter();
        templatesAdapter.setData(templatesId);
        templateRv.setAdapter(templatesAdapter);
    }

    public void setData() {
        templatesId = new ArrayList<>();

       /* Templates rRR = new Templates();
        rRR.titleTxt = "RRR";
        rRR.messageTxt = "Powerful Action Movie";
        templatesId.add(rRR);

        Templates puspha = new Templates();
        puspha.titleTxt = "Puspha";
        puspha.messageTxt = "Thaggede le";
        templatesId.add(puspha);*/
    }
}