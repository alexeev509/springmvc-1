package com.ssu.model;

import javax.persistence.*;

@Entity
@Table(name = "film_table")
public class Film {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "filmname")
    private String name;

    public Film() {
    }

    public Film (String name , Integer release_year) {

        this.name = name;
        this.release_year = release_year;
    }
    @Column(name = "release")
    private Integer release_year;

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release_year=" + release_year +
                '}';
    }
}
