package com.yanki.user.documents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String identificationDocument;
    private String cellphone;
    private String imei;
    private String email;
    private Wallet wallet;
}