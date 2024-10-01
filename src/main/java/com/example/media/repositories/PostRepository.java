package com.example.media.repositories;

import com.example.media.models.Post;
import com.example.media.models.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
