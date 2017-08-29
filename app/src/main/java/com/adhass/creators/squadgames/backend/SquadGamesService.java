package com.adhass.creators.squadgames.backend;

import com.adhass.creators.squadgames.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by adityanadkarni on 8/26/17.
 */

public interface SquadGamesService {
    @GET("")
    Call<User> getSuccessfulUser(@Path("username") String username);
}
