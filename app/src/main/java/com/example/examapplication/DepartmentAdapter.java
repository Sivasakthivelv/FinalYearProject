package com.example.examapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.department_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_cse_image;
        TextView tv_csename;
        TextView  tv_csedes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_csedes = (TextView) itemView.findViewById(R.id.tv_csedes);
            tv_csename = (TextView) itemView.findViewById(R.id.tv_csename);
            iv_cse_image = (ImageView) itemView.findViewById(R.id.iv_cse_image);
        }
    }
}
