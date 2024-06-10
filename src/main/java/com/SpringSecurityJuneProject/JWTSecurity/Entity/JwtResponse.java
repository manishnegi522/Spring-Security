package com.SpringSecurityJuneProject.JWTSecurity.Entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JwtResponse {


    private String jwtToken ;

    private String userName ;
}
