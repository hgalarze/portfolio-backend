package com.hgalarze.portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hgalarze.portfolio.Interface.IProjectService;

@RestController
public class ProjectController {

    @Autowired
    IProjectService iProjectService;
}
