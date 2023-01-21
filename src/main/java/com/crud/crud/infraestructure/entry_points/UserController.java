package com.crud.crud.infraestructure.entry_points;

import com.crud.crud.domain.model.User;
import com.crud.crud.domain.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserUseCase userUseCase;

    @GetMapping("")
    public ResponseEntity<Optional<User>> findById(@RequestParam("id") long id){
        return ResponseEntity.ok(userUseCase.findByid(id));
    }

    @PostMapping("/add") ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userUseCase.saveUser(user));
    }
}
