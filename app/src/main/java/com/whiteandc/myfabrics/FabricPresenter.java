package com.whiteandc.myfabrics;

import com.whiteandc.myfabrics.db.AppDatabase;
import com.whiteandc.myfabrics.model.Fabric;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by BLANCA on 26/03/2018.
 */

public class FabricPresenter {
    private FabricViewInterface view;

    public void init(){

        Single.just(AppDatabase.getAppDataBase(view.getApplicationContext()))
                .observeOn(Schedulers.io())
                .flatMap(this::getFabrics)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(view::showFabrics);

       // Single.just(AppDatabase.getAppDataBase(view.getApplicationContext()))
         //       .observeOn(Schedulers.io())
          //      .subscribe(db -> addFabric(db, new Fabric("Frabic nick name", "drawable://", "2", "leather" , true, "blue" )));

    }


    private Single<List<Fabric>> getFabrics(AppDatabase db) {
        return db.fabricDAO().getAll();
    }

    private Fabric addFabric(final AppDatabase db, Fabric fabric) {
        db.fabricDAO().insertAll(fabric);
        return fabric;
    }

    public void attachView(FabricViewInterface view){
        this.view= view;
    }

    public void detachView(){
        this.view= null;
    }

}
