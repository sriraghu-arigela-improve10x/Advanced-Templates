package com.improve10x.advancedtemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TemplatesAddBtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_add_btn);
        getSupportActionBar().setTitle("Add Templates");
    }
}