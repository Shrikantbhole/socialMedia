package com.example.media.services;

import com.example.media.models.SocialUser;
import com.example.media.repositories.SocialUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SocialUserService {
    private SocialUserRepository socialUserRepository;
    public SocialUserService(SocialUserRepository socialUserRepository) {
        this.socialUserRepository = socialUserRepository;
    }
    public List<SocialUser> findAll() {
        return socialUserRepository.findAll();
    }
    public SocialUser create(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }
}
