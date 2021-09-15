package com.example.staggeredgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<SliderItem> sliderItemList;
    private SliderAdapter sliderAdapter;
    private RecyclerView recyclerViewGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGridLayout = findViewById(R.id.recyclerViewGridLayout);
        recyclerViewGridLayout.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        sliderItemList = new ArrayList<>();
        sliderItemList.add(new SliderItem(R.drawable.model1));
        sliderItemList.add(new SliderItem(R.drawable.model2));
        sliderItemList.add(new SliderItem(R.drawable.model3));
        sliderItemList.add(new SliderItem(R.drawable.model14));
        sliderItemList.add(new SliderItem(R.drawable.model15));
        sliderItemList.add(new SliderItem(R.drawable.model6));
        sliderItemList.add(new SliderItem(R.drawable.model7));
        sliderItemList.add(new SliderItem(R.drawable.model18));
        sliderItemList.add(new SliderItem(R.drawable.model9));
        sliderItemList.add(new SliderItem(R.drawable.model10));
        sliderItemList.add(new SliderItem(R.drawable.model11));
        sliderItemList.add(new SliderItem(R.drawable.model12));
        sliderItemList.add(new SliderItem(R.drawable.model13));
        sliderItemList.add(new SliderItem(R.drawable.model14));
        sliderAdapter = new SliderAdapter(sliderItemList);
        recyclerViewGridLayout.setAdapter(sliderAdapter);

    }
}