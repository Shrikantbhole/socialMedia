package com.example.media.repositories;

import com.example.media.models.SocialGroup;
import com.example.media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialGroupRepository extends JpaRepository<SocialGroup, Long> {

}
