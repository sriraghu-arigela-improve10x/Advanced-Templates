package com.improve10x.advancedtemplates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TemplatesAdapter extends RecyclerView.Adapter<TemplatesViewHolder> {

    public List<Templates> templatesList;

    public void setData(List<Templates> templates) {
       templatesList = templates;
       notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TemplatesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item, parent, false);
        TemplatesViewHolder templatesViewHolder = new TemplatesViewHolder(view);
        return templatesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplatesViewHolder holder, int position) {
        Templates advanceTemplates = templatesList.get(position);
        holder.messageTxt.setText(advanceTemplates.messageTxt);
    }

    @Override
    public int getItemCount() {
        return templatesList.size();
    }
}
