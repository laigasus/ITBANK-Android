package com.sjb.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sjb.chat.model.ChatRoomModel;

import java.util.ArrayList;


public class ChatFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private String mParam1;

    public ChatFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ChatFragment newInstance(String param1) {
        ChatFragment fragment = new ChatFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    ArrayList<ChatRoomModel> ChatRoomModelList;
    ChatFragmentAdapter ChatFragmentAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.chatfragment_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager((inflater.getContext())));

        ChatRoomModelList = new ArrayList<>();
        ChatRoomModel user1 = new ChatRoomModel("aasd");
        user1.setToUserEmail("너무");
        ChatRoomModelList.add(user1);

        ChatRoomModel user2 = new ChatRoomModel("ppasd");
        user2.setToUserEmail("어렵다");
        ChatRoomModelList.add(user2);

        ChatFragmentAdapter = new ChatFragmentAdapter(ChatRoomModelList);
        recyclerView.setAdapter(ChatFragmentAdapter);

        return view;
    }
}