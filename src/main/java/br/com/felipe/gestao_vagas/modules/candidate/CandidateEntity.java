package br.com.felipe.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data

public class CandidateEntity {
    
    private UUID id;
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo não aceita espaço")
    private String username;
    @Email(message = "O campo email deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "o campo deve ser de 10 a 100")
    private String password;
    private String curriculum;


}
