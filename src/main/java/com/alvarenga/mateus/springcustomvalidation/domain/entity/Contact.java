package com.alvarenga.mateus.springcustomvalidation.domain.entity;

import com.alvarenga.mateus.springcustomvalidation.infra.validation.CharValid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor // Lombok
public class Contact {

    @Id
    @NotNull(message = "The id must not be null")
    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Email
    @NotBlank(message = "Email must not be blank")
    @Length(min = 5, max = 255)
    private String email;

    @NotBlank(message = "Phone number must not be blank")
    private String phone;

    @NotBlank(message = "Message must not be blank")
    private String message;

    @NotBlank(message = "Status must not be blank")
    @CharValid(chars = {"A", "I", "P"})
    private String status;
}
