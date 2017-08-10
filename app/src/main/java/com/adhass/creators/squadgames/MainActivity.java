package com.adhass.creators.squadgames;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private GameListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Game> games = new ArrayList<>();
        games.add(new Game("Game1", 7.98));
        games.add(new Game("Game2", 8));
        games.add(new Game("Game3", 10));
        games.add(new Game("Game4", 9));
        games.add(new Game("Game5", 9));
        games.add(new Game("Game6", 5));

        recyclerView = (RecyclerView) findViewById(R.id.game_list_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new GameListAdapter(games);
        recyclerView.setAdapter(adapter);
    }
}