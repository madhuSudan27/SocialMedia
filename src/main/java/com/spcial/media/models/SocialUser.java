package com.spcial.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "user")
    private SocialProfile profile;

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

}
