package com.example.source.fczatona;

import android.annotation.SuppressLint;
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

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {


    private ArrayList<Player> PlayerList;
    private Activity activity;

    public PlayerAdapter(ArrayList<Player> playerList, Activity activity) {
        this.PlayerList = playerList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_row, viewGroup, false);
        PlayerViewHolder holder = new PlayerViewHolder(row);
        return holder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder viewHolder, int position) {
        Player currentPlayer = new Player();
        currentPlayer.setPlayerName(PlayerList.get(position).getPlayerName());
        currentPlayer.setPlayerAge(PlayerList.get(position).getPlayerAge());
        currentPlayer.setPalyerImageUrl(PlayerList.get(position).getPalyerImageUrl());
        currentPlayer.setPlayerGoals(PlayerList.get(position).getPlayerGoals());
        currentPlayer.setPlayerPosition(PlayerList.get(position).getPlayerPosition());


        Glide.with(activity).load(currentPlayer.getPalyerImageUrl()).into(viewHolder.imgPlayer);
        viewHolder.tvPlayerAge.setText("Age : " + currentPlayer.getPlayerAge());
        viewHolder.tvPlayerGoals.setText("Goals : " + currentPlayer.getPlayerGoals());
        viewHolder.tvPlayerName.setText(currentPlayer.getPlayerName());
        viewHolder.tvPosition.setText(currentPlayer.getPlayerPosition());

    }

    @Override
    public int getItemCount() {
        return PlayerList.size();
    }

    class PlayerViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPlayer;
        TextView tvPlayerName, tvPosition, tvPlayerAge, tvPlayerGoals;

        public PlayerViewHolder(View itemView) {
            super(itemView);

            imgPlayer = (ImageView) itemView.findViewById(R.id.imgPlayer);
            tvPlayerName = (TextView) itemView.findViewById(R.id.tvPlayerName);
            tvPosition = (TextView) itemView.findViewById(R.id.tvPosition);
            tvPlayerAge = (TextView) itemView.findViewById(R.id.tvPlayerAge);
            tvPlayerGoals = (TextView) itemView.findViewById(R.id.tvPlayerGoals);
        }
    }
}
