package com.SpringSecurityJuneProject.JWTSecurity.Entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JwtRequest {

    private String email ;
    private  String  password ;

}
