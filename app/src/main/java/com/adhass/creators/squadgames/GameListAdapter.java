package com.adhass.creators.squadgames;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adhass.creators.squadgames.listeners.OnCardClickedListener;
import com.adhass.creators.squadgames.model.Game;

import java.util.List;

/**
 * Created by adityanadkarni on 8/8/17.
 */

public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.ViewHolder> {

    private List<Game> games;
    private OnCardClickedListener listener;

    public GameListAdapter(List<Game> games, OnCardClickedListener listener) {
        this.games = games;
        this.listener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(
                parent.getContext()).inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(cardView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.gameTitle.setText(games.get(position).getTitle());
        holder.gameRating.setText(String.valueOf(games.get(position)
                .getRating()
                .getRatingAverage()
                .getValue()));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView gameTitle;
        TextView gameRating;
        View view;
        ViewHolder(View view) {
            super(view);
            this.view = view;
            gameTitle = (TextView) view.findViewById(R.id.board_game_title);
            gameRating = (TextView) view.findViewById(R.id.board_game_rating);
        }

    }

}
