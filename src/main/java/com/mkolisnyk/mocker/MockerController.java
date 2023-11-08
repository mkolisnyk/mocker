package com.mkolisnyk.mocker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MockerController {
    @PostMapping("/session")
    ResponseEntity<UUID> createSession() {
        return ResponseEntity.status(HttpStatus.CREATED).body(UUID.randomUUID());
    }

    @GetMapping("/ping")
    ResponseEntity<?> ping() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/mock/{sessionId}")
    ResponseEntity<?> ping(@RequestBody MockerItem item) {
        return ResponseEntity.ok().build();
    }
}
