package com.yanki.app.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Transaction {
    private String id;
    private String source;
    private String target;
    private String amount;
}