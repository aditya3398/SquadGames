package com.adhass.creators.squadgames;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by adityanadkarni on 8/8/17.
 */

public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.ViewHolder> {

    private List<Game> games;

    GameListAdapter(List<Game> games) {
        this.games = games;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(
                parent.getContext()).inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(cardView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.gameTitle.setText(games.get(position).getTitle());
        holder.gameRating.setText(String.valueOf(games.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView gameTitle;
        TextView gameRating;
        ViewHolder(View view) {
            super(view);
            gameTitle = (TextView) view.findViewById(R.id.board_game_title);
            gameRating = (TextView) view.findViewById(R.id.board_game_rating);
        }
    }
}
