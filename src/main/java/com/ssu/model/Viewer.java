package com.ssu.model;

public class Viewer {
    private String name;

    public Viewer(String name, String film) {
        this.name = name;
        this.film = film;
    }

    private String film;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
