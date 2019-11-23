package com.ssu.service;

import com.ssu.model.Film;
import com.ssu.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> generateFilm() {
        System.out.println(filmRepository.findAll());
//        return new Film("Avatar", 2009);
        return filmRepository.findAll();
    }
}
