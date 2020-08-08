package com.chapter07.a03recycleview.model;

public class MainModel {
    private String id;
    private String statusMessage;

    public String toString() {
        return "MainModel{" +
                "id='" + id + '\'' +
                ", statusMessage='" + statusMessage + '\'' + '}';
    }

    public String getId() {
        return id;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
