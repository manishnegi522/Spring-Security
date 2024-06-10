package com.SpringSecurityJuneProject.JWTSecurity.Service;

import com.SpringSecurityJuneProject.JWTSecurity.Entity.user;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userService {

private List<user> store = new ArrayList<>() ;

    userService () {

        // created a list which we have to secure

        store.add(new user(UUID.randomUUID().toString() ,"manish" , "manishnegi522@gmail.com")) ;
        store.add(new user(UUID.randomUUID().toString() ,"Navjot" , "Navjot@gmail.com")) ;
        store.add(new user(UUID.randomUUID().toString() ,"ankit" , "ankit@gmail.com")) ;
        store.add(new user(UUID.randomUUID().toString() ,"vivek" , "vivek@gmail.com")) ;

    }

    public List<user> getUser () {
        return this.store ;
    }


    }