package com.example.media.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Post
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "social_user_id")
    private SocialUser socialUser  ;

}
