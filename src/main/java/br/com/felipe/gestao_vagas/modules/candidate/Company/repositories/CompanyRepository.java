package br.com.felipe.gestao_vagas.modules.candidate.Company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.felipe.gestao_vagas.modules.candidate.Company.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity,UUID> {
      Optional<CompanyEntity>findByUsernameOrEmail(String usename, String email);
}
