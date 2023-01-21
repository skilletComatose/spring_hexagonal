package com.crud.crud.domain.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long  identifier;
    private String name;
    private String lastname;
    private String email;

}

