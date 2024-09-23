package com.example.media.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Profile
{

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "socialProfile")
    private SocialUser user;


}
