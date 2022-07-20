package com.alvarenga.mateus.springcustomvalidation.domain.entity;

import com.alvarenga.mateus.springcustomvalidation.infra.validation.Match;
import com.alvarenga.mateus.springcustomvalidation.infra.validation.ShouldContain;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor // Lombok
public class Contact {

    @Id
    @Min(1)
    @GeneratedValue
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
    @ShouldContain(check = ":", message = "Message must contain ':'")
    private String message;

    @NotBlank(message = "Status must not be blank")
    @Match(check = {"A", "I", "Peee"}, message = "Status must be A, I or P")
    private String status;
}
