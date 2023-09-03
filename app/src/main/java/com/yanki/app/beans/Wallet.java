package com.yanki.app.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Wallet {
    private Integer id;
    private String identificationDocument;
    private String numberBankAccount;
    private BigDecimal amount = new BigDecimal(0);
}