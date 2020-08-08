package com.sjb.chat;

import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sjb.chat.model.UserModel;

import java.util.ArrayList;

public class FriendFragmentAdapter extends RecyclerView.Adapter<FriendFragmentAdapter.FriendViewHolder> {

    ArrayList<UserModel> userModels;

    public FriendFragmentAdapter(ArrayList<UserModel> userModels) {
        this.userModels = userModels;
    }

    @Override
    public FriendFragmentAdapter.FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friend, parent, false);
        FriendViewHolder viewHolder = new FriendViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendFragmentAdapter.FriendViewHolder holder, int position) {
        holder.nametv.setText(userModels.get(position).getUserName());
        holder.emtv.setText(userModels.get(position).getUserEmail());

    }

    @Override
    public int getItemCount() {
        return (null != userModels ? userModels.size() : 0);
    }

    public class FriendViewHolder extends RecyclerView.ViewHolder {
        TextView emtv, nametv;

        public FriendViewHolder(View view) {
            super(view);
            this.emtv = (TextView) view.findViewById(R.id.email_tv);
            this.nametv = (TextView) view.findViewById(R.id.name_tv);
        }
    }

}
