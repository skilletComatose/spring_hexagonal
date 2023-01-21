package com.crud.crud.infraestructure.driver_adapter.jpa_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDataRepository extends JpaRepository<UserData,Long> {
    @Override
    Optional<UserData> findById(Long id);
}
