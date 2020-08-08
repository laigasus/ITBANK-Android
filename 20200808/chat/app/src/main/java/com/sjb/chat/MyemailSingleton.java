package com.sjb.chat;

public class MyemailSingleton {
    private static final MyemailSingleton instance
            = new MyemailSingleton();
    private String myemail;
    public void setMyemail(String myemail) { this.myemail = myemail; }
    public String getMyemail() { return myemail; }
    private MyemailSingleton() { }
    public static MyemailSingleton getInstance() { return instance; }
}
