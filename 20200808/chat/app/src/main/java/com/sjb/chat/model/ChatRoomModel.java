package com.sjb.chat.model;

public class ChatRoomModel {
    private String toUserEmail;

    public ChatRoomModel(String toUserEmail) {
        this.toUserEmail = toUserEmail;
    }

    @Override
    public String toString() {
        return "ChatRoomModel{" +
                "toUserEmail='" + toUserEmail + '\'' +
                '}';
    }

    public void setToUserEmail(String toUserEmail) {
        this.toUserEmail = toUserEmail;
    }

    public String getToUserEmail() {
        return toUserEmail;
    }
}
