package com.sjb.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sjb.chat.model.UserModel;

import java.util.ArrayList;

public class FriendFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FriendFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FriendFragment newInstance(String param1, String param2) {
        FriendFragment fragment = new FriendFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    ArrayList<UserModel> userModelList;
    FriendFragmentAdapter friendFragmentAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friend, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.friendfragment_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager((inflater.getContext())));

        userModelList = new ArrayList<>();
        UserModel user1 = new UserModel();
        user1.setUserName("A");
        user1.setUserEmail("B");
        userModelList.add(user1);

        UserModel user2 = new UserModel();
        user2.setUserName("C");
        user2.setUserEmail("D");
        userModelList.add(user2);

        friendFragmentAdapter = new FriendFragmentAdapter(userModelList);
        recyclerView.setAdapter(friendFragmentAdapter);

        return view;
    }
}