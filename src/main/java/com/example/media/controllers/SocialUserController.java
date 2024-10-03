package com.example.media.controllers;

import com.example.media.models.SocialUser;
import com.example.media.services.SocialUserService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

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

    @DeleteMapping("/api/socialUsers/{id}")
    public ResponseEntity<SocialUser> deleteSocialUser(@PathVariable("id") long id) {
        return ok(socialUserService.delete(id));
    }
}
