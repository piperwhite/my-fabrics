package com.whiteandc.myfabrics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.whiteandc.myfabrics.model.Fabric;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FabricListActivity extends AppCompatActivity implements FabricViewInterface {

    @BindView(R.id.rv_fabrics)
    RecyclerView rvFabrics;

    FabricAdapter adapter = new FabricAdapter();
    FabricPresenter presenter = new FabricPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric_list);
        ButterKnife.bind(this);

        rvFabrics.setAdapter(adapter);
        rvFabrics.setLayoutManager(new LinearLayoutManager(this));

        presenter.attachView(this);
        presenter.init();
    }

    @Override
    public void showFabrics(List<Fabric> fabrics) {
        adapter.addFabrics(fabrics);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
