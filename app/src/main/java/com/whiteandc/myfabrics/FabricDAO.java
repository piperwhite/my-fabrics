package com.whiteandc.myfabrics;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.whiteandc.myfabrics.model.Fabric;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface FabricDAO {
    @Query("SELECT * FROM fabric")
    Single<List<Fabric>> getAll();

    @Query("SELECT * FROM fabric WHERE nick_name LIKE :name")
    Fabric findByNickName(String name);

    @Insert
    void insertAll(Fabric... fabrics);

    @Delete
    void delete(Fabric fabric);
}
