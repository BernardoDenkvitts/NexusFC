package com.nexusfc.api.Auth.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {
    private String _id;
    private String name;
    private String email;
    private String created_at;
    private String last_rewarded_login;
    private Float coins;
    private String token;
}
