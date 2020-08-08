package com.sjb.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sjb.chat.model.ChatRoomModel;
import com.sjb.chat.model.UserModel;

import java.util.ArrayList;

public class ChatFragmentAdapter extends RecyclerView.Adapter<ChatFragmentAdapter.ChatViewHolder> {

    ArrayList<ChatRoomModel> userModels;

    public ChatFragmentAdapter(ArrayList<ChatRoomModel> userModels) {
        this.userModels = userModels;
    }

    @Override
    public ChatFragmentAdapter.ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        ChatFragmentAdapter.ChatViewHolder viewHolder = new ChatFragmentAdapter.ChatViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatFragmentAdapter.ChatViewHolder holder, int position) {
        holder.titletv.setText(userModels.get(position).getToUserEmail());

    }

    @Override
    public int getItemCount() {
        return (null != userModels ? userModels.size() : 0);
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {
        TextView titletv;

        public ChatViewHolder(View view) {
            super(view);
            this.titletv = (TextView) view.findViewById(R.id.title_tv);
        }
    }
}
