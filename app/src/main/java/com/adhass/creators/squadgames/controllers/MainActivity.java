package com.adhass.creators.squadgames.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import com.adhass.creators.squadgames.GameListAdapter;
import com.adhass.creators.squadgames.R;
import com.adhass.creators.squadgames.listeners.OnCardClickedListener;
import com.adhass.creators.squadgames.model.Game;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private GameListAdapter adapter;

    private OnCardClickedListener gameViewListener;

    public static final String GAME_REFERENCE = "GAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Game> games = new ArrayList<>();
        games.add(new Game("Game1", 7.98));
        games.add(new Game("Game2", 8));
        games.add(new Game("Game3", 10));
        games.add(new Game("Game4", 9));
        games.add(new Game("Game5", 9));
        games.add(new Game("Game6", 5));

       gameViewListener = new OnCardClickedListener() {
           @Override
           public void onClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, GameInfoActivity.class);
                intent.putExtra(GAME_REFERENCE, games.get(position));
                startActivity(intent);
           }
       };

        recyclerView = (RecyclerView) findViewById(R.id.game_list_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new GameListAdapter(games, gameViewListener);
        recyclerView.setAdapter(adapter);
    }
}