package com.sjb.chat.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "androidDB", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE friend_list (email varchar(50) not null,name	varchar(10) not null, primary key(email));");
        db.execSQL("CREATE TABLE messages (fromUser varchar(50) not null,toUser varchar(50) not null,message varchar(100) not null);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS friend_list");
        db.execSQL("DROP TABLE IF EXISTS messages");
        onCreate(db);
    }
}