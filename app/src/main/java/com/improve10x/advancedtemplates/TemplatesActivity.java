package com.improve10x.advancedtemplates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Templates> templatesId;
    public  RecyclerView templateRv;
    public TemplatesAdapter templatesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        setData();
        advanceTemplatesRv();
    }

    public void advanceTemplatesRv() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templatesAdapter = new TemplatesAdapter();
        templatesAdapter.setData(templatesId);
        templateRv.setAdapter(templatesAdapter);
    }

    public void setData() {
        templatesId = new ArrayList<>();

        Templates rRR = new Templates();
        rRR.titleTxt = "RRR";
        rRR.messageTxt = "Powerful Action Movie";
        templatesId.add(rRR);

        Templates puspha = new Templates();
        puspha.titleTxt = "Puspha";
        puspha.messageTxt = "Thaggede le";
        templatesId.add(puspha);
    }
}