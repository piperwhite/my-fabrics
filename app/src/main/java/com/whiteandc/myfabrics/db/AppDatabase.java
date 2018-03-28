package com.whiteandc.myfabrics.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = { }, version = 1) //TODO declare entities
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public static AppDatabase getAppDataBase(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "fabric-database").build();
        }
        return instance;
    }

    //TODO declare get DAOs methods

    public static void destroyInstance() {
        instance = null;
    }
}
