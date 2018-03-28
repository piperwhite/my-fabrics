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
        fakeFabrics();
        view.showFabrics(fabrics);
    }

    private void fakeFabrics() {
        fabrics.add(new Fabric("Frabic nick name", "drawable://", "2", "leather" , true, "blue" ));
        fabrics.add(new Fabric("Frabic nick name 2", "drawable://bluefabric.jpg", "2", "leather" , true, "blue" ));
    }

    public void attachView(FabricViewInterface view){
        this.view= view;
    }

    public void detachView(){
        this.view= null;
    }

}
