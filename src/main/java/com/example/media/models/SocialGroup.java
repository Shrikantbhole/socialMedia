package com.example.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Data
@Entity
public class SocialGroup {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToMany(mappedBy = "groups")
    private Set<SocialUser> socialUsers = new HashSet<>();
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
