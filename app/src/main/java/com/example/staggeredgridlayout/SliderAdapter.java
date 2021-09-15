package com.example.staggeredgridlayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.ViewHolder> {

    private List<SliderItem> sliderItemList;

    public SliderAdapter(List<SliderItem> sliderItemList) {
        this.sliderItemList = sliderItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slide_item_container, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SliderItem sliderItem = sliderItemList.get(position);
        int image = sliderItem.getImage();
        holder.imageSlide.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return sliderItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView imageSlide;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageSlide = itemView.findViewById(R.id.imageSlide);
        }
    }

}
