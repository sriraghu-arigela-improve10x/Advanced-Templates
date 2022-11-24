package com.improve10x.advancedtemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplatesAddBtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_add_btn);
        getSupportActionBar().setTitle("Add Templates");
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText templateTxt = findViewById(R.id.template_txt);
            String template = templateTxt.getText().toString();
            creteTask(template);
        });
    }

    public void creteTask(String template) {
        Templates templates = new Templates();
        templates.messageTxt = template;

        TemplatesApi templatesApi = new TemplatesApi();
        TemplatesService templatesService = templatesApi.createTemplatesService();
        Call<Templates> call = templatesService.createTask(templates);
        call.enqueue(new Callback<Templates>() {
            @Override
            public void onResponse(Call<Templates> call, Response<Templates> response) {
                Toast.makeText(TemplatesAddBtnActivity.this, "Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }

            @Override
            public void onFailure(Call<Templates> call, Throwable t) {
                Toast.makeText(TemplatesAddBtnActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}