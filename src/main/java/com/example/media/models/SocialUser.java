package com.example.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.*;
@Data
@Entity
public class SocialUser
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)


    private SocialProfile socialProfile;
    public void setSocialProfile(SocialProfile socialProfile)
    {
        socialProfile.setUser(this);
        this.socialProfile = socialProfile;
    }

    @OneToMany(mappedBy = "socialUser")
    private List<Post> posts = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<SocialGroup> groups = new HashSet<>();

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
