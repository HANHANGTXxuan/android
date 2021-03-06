package com.hhtxproject.piafriendscollege.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hhtxproject.piafriendscollege.R;

import java.util.ArrayList;

public class CSScriptAdapter extends RecyclerView.Adapter<CSScriptAdapter.ViewHolder> {
    private ArrayList<String> data;
    public CSScriptAdapter(ArrayList<String> data){
        this.data = data;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_c_script_item, parent, false);
        return new CSScriptAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.Title.setText(data.get(position));
//        holder.Number.setText();
//        holder.category.setText();
//        holder.head.setBackgroundResource();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView head;
        TextView category;
        TextView Number;
        TextView Title;

        public ViewHolder(View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head_img);
            category = itemView.findViewById(R.id.category);
            Number = itemView.findViewById(R.id.number);
            Title = itemView.findViewById(R.id.title_text);
        }
    }
}
