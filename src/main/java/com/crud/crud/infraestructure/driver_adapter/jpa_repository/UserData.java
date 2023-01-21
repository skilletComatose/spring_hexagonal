package com.crud.crud.infraestructure.driver_adapter.jpa_repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  identifier;
    private String name;
    private String lastname;
    private String email;
}
