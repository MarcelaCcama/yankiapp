package com.yanki.app.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String identificationDocument;
    private String cellphone;
    private String imei;
    private String email;
    private Wallet wallet;
}