package br.com.felipe.gestao_vagas.modules.candidate.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.gestao_vagas.modules.candidate.CandidateEntity;


public interface CandidateRepository extends JpaRepository<CandidateEntity,UUID>{
   Optional<CandidateEntity>findByUsernameOrEmail(String usename, String email);
                
}