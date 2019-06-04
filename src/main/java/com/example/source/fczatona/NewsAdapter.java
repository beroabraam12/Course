package com.example.source.fczatona;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    ArrayList<News> NewsList;
    Activity activity;

    public NewsAdapter(ArrayList<News> NewsList, Activity currentActivity) {
        this.NewsList = NewsList;
        activity = currentActivity;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_row, viewGroup, false);
        NewsViewHolder holder = new NewsViewHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News currentNews = new News();
        currentNews.setImg_url(NewsList.get(position).getImg_url());
        currentNews.setNews_title(NewsList.get(position).getNews_title());


        holder.tvNews.setText(currentNews.getNews_title());
        Glide.with(activity).load(currentNews.getImg_url()).into(holder.imgNews);

    }

    @Override
    public int getItemCount() {
        return NewsList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgNews;
        TextView tvNews;

        public NewsViewHolder(View itemView) {
            super(itemView);

            imgNews = (ImageView) itemView.findViewById(R.id.imgNews);
            tvNews = (TextView) itemView.findViewById(R.id.tvNews);

        }
    }
}
