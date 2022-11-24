package com.improve10x.advancedtemplates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdvanceTemplatesAdapter extends RecyclerView.Adapter<AdvanceTemplatesViewHolder> {

    public ArrayList<AdvanceTemplates> templatesList;

    public void setData(ArrayList<AdvanceTemplates> templates) {
       templatesList = templates;
       notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdvanceTemplatesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advancetemplate_item, parent, false);
        AdvanceTemplatesViewHolder advanceTemplatesViewHolder = new AdvanceTemplatesViewHolder(view);
        return advanceTemplatesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvanceTemplatesViewHolder holder, int position) {
        AdvanceTemplates advanceTemplates = templatesList.get(position);
        holder.messageTxt.setText(advanceTemplates.messageTxt);
    }

    @Override
    public int getItemCount() {
        return templatesList.size();
    }
}
