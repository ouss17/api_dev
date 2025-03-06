package fr.doranco.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.doranco.backend.models.User;

@RestController
@RequestMapping("user")
public class UserController {
    private static final Map<Long, User> users = new HashMap<>();

    static {
        users.put(1L, new User(1L, "Alice", "alice@example.com"));
        users.put(2L, new User(2L, "Bob", "bob@example.com"));
        users.put(3L, new User(3L, "Charlie", "charlie@example.com"));
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.getOrDefault(id, null);
    }
}