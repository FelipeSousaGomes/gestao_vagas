package br.com.felipe.gestao_vagas.modules.candidate.Company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "compány")
public class CompanyEntity {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
     @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo não aceita espaço")
    private String username;
    @Email(message = "O campo email deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "o campo deve ser de 10 a 100")
    private String password;
    private String website;
    private String name;
    private String description;
    
    @CreationTimestamp
    private LocalDateTime createdAt;
}

