package com.example.moaathalrajab.recycleview_demo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.item_list);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ItemArrayAdapter(getBaseContext(), itemList);
        mRecyclerView.setAdapter(mAdapter);

        fillWithNonsenseText();
    }

    public void fillWithNonsenseText() {
        itemList.add(new Item(1,"Hello", "Ben"));
        itemList.add(new Item(2,"Hello", "Noor"));
        itemList.add(new Item(3,"This is an example about RecyclerView", "Ben"));
        itemList.add(new Item(4,"Great news!", "Noor"));
        itemList.add(new Item(5,"Enjoy reading!", "Ben"));
        itemList.add(new Item(6,"You too", "Noor"));
        itemList.add(new Item(7,"Hello", "Ben"));
        itemList.add(new Item(8,"Hello", "Noor"));
        itemList.add(new Item(9,"This is an example about RecyclerView", "Ben"));
        itemList.add(new Item(10,"Great news!", "Noor"));
        itemList.add(new Item(11,"Enjoy reading!", "Ben"));
        itemList.add(new Item(12,"You too", "Noor"));
        itemList.add(new Item(13,"Hello", "Ben"));
        itemList.add(new Item(14,"Hello", "Noor"));
        itemList.add(new Item(15,"This is an example about RecyclerView", "Ben"));
        itemList.add(new Item(16,"Great news!", "Noor"));
        itemList.add(new Item(17,"Enjoy reading!", "Ben"));
        itemList.add(new Item(18,"You too", "Noor"));

    }
}


