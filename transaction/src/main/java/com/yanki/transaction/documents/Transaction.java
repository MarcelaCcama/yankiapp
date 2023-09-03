package com.yanki.transaction.documents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "transaction")
public class Transaction {

    @Id
    private String id;
    private String source;
    private String target;
    private String amount;
}