package com.spcial.media.service;

import com.spcial.media.models.SocialUser;
import com.spcial.media.repository.SocialGroupRepository;
import com.spcial.media.repository.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;


    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser user) {
        return socialUserRepository.save(user);
    }
}
