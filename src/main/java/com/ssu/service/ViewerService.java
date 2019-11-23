package com.ssu.service;

import com.ssu.model.Viewer;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {

    public Viewer generateViewer() {
        return new Viewer("Tony", "Avatar");
    }
}
