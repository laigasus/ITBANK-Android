package com.chapter07.a03recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chapter07.a03recycleview.model.MainModel;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private ArrayList<MainModel> mainModelArrayList;

    public MainAdapter(ArrayList<MainModel> list) {
        this.mainModelArrayList = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView sm;

        public MyViewHolder(View view) {
            super(view);
            this.id = (TextView) view.findViewById(R.id.id_tv);
            this.sm = (TextView) view.findViewById(R.id.sm_tv);
        }
    }

    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewGroup = null;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    //
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText(mainModelArrayList.get(position).getId());
        holder.sm.setText(mainModelArrayList.get(position).getStatusMessage());
    }

    @Override
    public int getItemCount() {
        return (null != mainModelArrayList ? mainModelArrayList.size() : 0);
    }


}
