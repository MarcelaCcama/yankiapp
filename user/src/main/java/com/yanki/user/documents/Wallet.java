package com.yanki.user.documents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Wallet {

    @Id
    private Integer id;
    private String identificationDocument;
    private String numberBankAccount;
    private BigDecimal amount = new BigDecimal(0);

}