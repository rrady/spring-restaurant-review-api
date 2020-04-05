package com.awbd.restaurantreview.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginModel {
    private String email;

    private String password;
}
