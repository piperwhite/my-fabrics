package com.whiteandc.myfabrics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FabricListActivity extends AppCompatActivity {

    @BindView(R.id.rv_fabrics)
    RecyclerView rvFabrics;

    FabricAdapter adapter = new FabricAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric_list);
        ButterKnife.bind(this);

        rvFabrics.setAdapter(adapter);
        rvFabrics.setLayoutManager(new LinearLayoutManager(this));

    }
}
