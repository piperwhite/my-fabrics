package com.whiteandc.myfabrics;

import android.content.Context;

import com.whiteandc.myfabrics.model.Fabric;

import java.util.List;

/**
 * Created by BLANCA on 26/03/2018.
 */

public interface FabricViewInterface {
    void showFabrics(List<Fabric> fabrics);
    Context getApplicationContext();
}
