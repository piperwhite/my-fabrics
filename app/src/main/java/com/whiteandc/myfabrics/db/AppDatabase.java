package com.whiteandc.myfabrics.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.whiteandc.myfabrics.FabricDAO;
import com.whiteandc.myfabrics.model.Fabric;

@Database(entities = {Fabric.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DB_NAME = "fabric-database";
    private static AppDatabase instance;

    public static AppDatabase getAppDataBase(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).build();
        }
        return instance;
    }

    public abstract FabricDAO fabricDAO();

    public static void destroyInstance() {
        instance = null;
    }
}
