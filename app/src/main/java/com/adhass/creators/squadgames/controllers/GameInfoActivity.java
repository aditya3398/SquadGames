package com.adhass.creators.squadgames.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.adhass.creators.squadgames.R;
import com.adhass.creators.squadgames.model.Game;

public class GameInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view);
        Game game = (Game)(getIntent().getSerializableExtra(MainActivity.GAME_REFERENCE));
        ((TextView)(findViewById(R.id.gameViewTitle))).setText(game.getTitle());
    }
}
