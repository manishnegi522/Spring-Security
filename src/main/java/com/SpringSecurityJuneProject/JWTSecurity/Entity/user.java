package com.SpringSecurityJuneProject.JWTSecurity.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class user {


    private String userId ;
    private String name ;
    private String email ;

}
