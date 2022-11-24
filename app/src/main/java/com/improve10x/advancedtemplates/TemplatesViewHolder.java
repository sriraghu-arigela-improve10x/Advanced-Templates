package com.improve10x.advancedtemplates;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.temporal.Temporal;

public class TemplatesViewHolder extends RecyclerView.ViewHolder {

    public TextView messageTxt;

    public TemplatesViewHolder(@NonNull View itemView) {
        super(itemView);
        messageTxt = itemView.findViewById(R.id.message_txt);
    }
}
