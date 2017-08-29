package com.adhass.creators.squadgames.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class GameList {
    @ElementList
    private List<Game> gameList;
}
