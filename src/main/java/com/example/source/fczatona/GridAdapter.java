package com.example.source.fczatona;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Tournament> tournamentList;
    View view;

    public GridAdapter(Context context, ArrayList<Tournament> tournamentList) {
        this.context = context;
        this.tournamentList = tournamentList;
    }

    @Override
    public int getCount() {
        return tournamentList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tvCupName, tvNum;
        ImageView imgCup;
        if (convertView == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_row, parent, false);
            tvCupName = view.findViewById(R.id.tvCupName);
            tvNum = view.findViewById(R.id.tvNum);
            imgCup = view.findViewById(R.id.imgCup);

            tvCupName.setText(tournamentList.get(position).getCupName());
            tvNum.setText(tournamentList.get(position).getCupNum() + " Times");
            Glide.with(context).load(tournamentList.get(position).getImgUrl()).into(imgCup);

        }


        return view;
    }
}
