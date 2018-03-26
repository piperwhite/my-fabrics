package com.whiteandc.myfabrics;

import com.whiteandc.myfabrics.model.Fabric;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BLANCA on 26/03/2018.
 */

public class FabricPresenter {
    private List<Fabric> fabrics = new ArrayList<>();
    private FabricViewInterface view;

    public void init(){
        view.showFabrics(fabrics);
    }

    public void attachView(FabricViewInterface view){
        this.view= view;
    }

    public void detachView(){
        this.view= null;
    }

}
