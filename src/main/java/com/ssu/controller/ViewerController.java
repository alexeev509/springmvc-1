package com.ssu.controller;

import com.ssu.model.Film;
import com.ssu.model.User;
import com.ssu.model.Viewer;
import com.ssu.service.FilmService;
import com.ssu.service.UserService;
import com.ssu.service.ViewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewerController {
    @Autowired
    private ViewerService viewerService;

    @RequestMapping(method = RequestMethod.GET, value = "viewer")
    @ResponseBody
    public Viewer getViewer() {
        return viewerService.generateViewer();
    }

}