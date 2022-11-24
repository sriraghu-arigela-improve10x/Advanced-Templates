package com.improve10x.advancedtemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class AdvanceTemplatesActivity extends AppCompatActivity {

    public ArrayList<AdvanceTemplates> templatesId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_templates);
        getSupportActionBar().setTitle("Advance Templates");
        setData();
    }

    public void setData() {
        templatesId = new ArrayList<>();

        AdvanceTemplates rRR = new AdvanceTemplates();
        rRR.titleTxt = "RRR";
        rRR.messageTxt = "Powerful Action Movie";
        templatesId.add(rRR);

        AdvanceTemplates puspha = new AdvanceTemplates();
        puspha.titleTxt = "Puspha";
        puspha.messageTxt = "Thaggede le";
        templatesId.add(puspha);
    }
}