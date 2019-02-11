package com.springframework.spring5webapp.controllers;

import com.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by revin on 11.02.2019.
 */

@Controller
public class AuthorController {

    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    private String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
