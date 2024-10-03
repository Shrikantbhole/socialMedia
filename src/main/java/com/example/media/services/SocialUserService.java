package com.example.media.services;

import com.example.media.models.SocialUser;
import com.example.media.repositories.SocialUserRepository;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public  SocialUser delete(long id) {
         SocialUser user = socialUserRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException("Social User Not Found"));
        // Manually initialize lazy-loaded collections before deletion
        Hibernate.initialize(user.getPosts());
        Hibernate.initialize(user.getGroups());
         socialUserRepository.delete(user);
         return user;
    }

}
