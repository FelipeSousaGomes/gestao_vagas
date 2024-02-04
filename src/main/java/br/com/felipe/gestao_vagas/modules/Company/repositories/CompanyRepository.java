package br.com.felipe.gestao_vagas.modules.Company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.gestao_vagas.modules.Company.Entities.CompanyEntity;
import br.com.felipe.gestao_vagas.modules.candidate.entitites.CandidateEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity,UUID> {
      Optional<CompanyEntity>findByUsernameOrEmail(String usename, String email);
}
