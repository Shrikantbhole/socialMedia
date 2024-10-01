package com.example.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class SocialProfile
{

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private SocialUser user;
    private String description;

    public void setUser(SocialUser user) {
        this.user = user;
        this.user.setSocialProfile(this);
    }
}
