package com.alvarenga.mateus.springcustomvalidation.validationTest;

import com.alvarenga.mateus.springcustomvalidation.domain.entity.Contact;
import jdk.jfr.Description;

import javax.validation.Validation;
import javax.validation.Validator;

import javax.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ContactValidationTest {

    Validator validator;

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void allValid() {
        // Given
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setEmail("asdf@gmail.com");
        contact.setName("ABCDEFG");
        contact.setPhone("asdf");
        contact.setStatus("A");
        contact.setMessage("asdf");

        // When
        var errors = validator.validate(contact);

        // Then
        assertEquals(0, errors.size());
    }

    @Test
    void allInvalid() {
        // Given
        Contact contact = new Contact();
        contact.setId(null);
        contact.setEmail("");
        contact.setName("");
        contact.setPhone("");
        contact.setStatus("A");
        contact.setMessage("");

        // When
        var errors = validator.validate(contact);

        // Then
        assertEquals(6, errors.size());
    }
}
