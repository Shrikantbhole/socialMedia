package com.example.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.util.Objects;

@Entity
@Data
public class SocialProfile
{

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "socialProfile")

    @JsonIgnore
    private SocialUser user;
    private String description;



    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
