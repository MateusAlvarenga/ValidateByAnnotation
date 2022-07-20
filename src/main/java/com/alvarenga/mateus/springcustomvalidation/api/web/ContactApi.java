package com.alvarenga.mateus.springcustomvalidation.api.web;

import com.alvarenga.mateus.springcustomvalidation.domain.entity.Contact;
import com.alvarenga.mateus.springcustomvalidation.domain.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/contact")
public class ContactApi {

    private final ContactRepository contactRepository;

    @GetMapping
    public ResponseEntity<?> getContact() {
        return ResponseEntity.ok(contactRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> postContact(@RequestBody @Validated Contact contact){
        return ResponseEntity.ok(contactRepository.save(contact));
    }
}
