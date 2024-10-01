package com.example.media.controllers;

import com.example.media.models.SocialUser;
import com.example.media.services.SocialUserService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialUserController {

    @Autowired
    SocialUserService socialUserService;

    @GetMapping("/api/socialUsers")
    public ResponseEntity<List<SocialUser>> getSocialUsers() {
        return new ResponseEntity<>(socialUserService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/api/socialUsers")
    public ResponseEntity<SocialUser> createSocialUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialUserService.create(socialUser), HttpStatus.CREATED);
    }
}
