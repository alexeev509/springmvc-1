package com.ssu.controller;

import com.ssu.model.Film;
import com.ssu.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping(method = RequestMethod.GET, value = "getfilm")
    @ResponseBody
    public List<Film> getFilm() {
        return filmService.generateFilm();
    }
}
