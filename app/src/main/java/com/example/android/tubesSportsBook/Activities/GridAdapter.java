package com.example.android.tubesSportsBook.Activities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tubesSportsBook.R;

import java.util.ArrayList;
import java.util.List;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<SportsItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<SportsItem>();
        SportsItem nama = new SportsItem();

        nama.setName("Badminton");
        nama.setThumbnail(R.drawable.badminton);
        nama.setDeskripsie("tes123");
        mItems.add(nama);

        nama = new SportsItem();
        nama.setName("Basket Ball");
        nama.setThumbnail(R.drawable.basket);
        mItems.add(nama);

        nama = new SportsItem();
        nama.setName("Football");
        nama.setThumbnail(R.drawable.bola);
        mItems.add(nama);

        nama = new SportsItem();
        nama.setName("Renang");
        nama.setThumbnail(R.drawable.renang1);
        mItems.add(nama);

        nama = new SportsItem();
        nama.setName("Sepak Takraw");
        nama.setThumbnail(R.drawable.takraw);
        mItems.add(nama);

        nama = new SportsItem();
        nama.setName("Footsall");
        nama.setThumbnail(R.drawable.footsal);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        SportsItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
