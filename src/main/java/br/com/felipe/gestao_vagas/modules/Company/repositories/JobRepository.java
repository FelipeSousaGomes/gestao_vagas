package br.com.felipe.gestao_vagas.modules.Company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.gestao_vagas.modules.Company.Entities.JobEntity;

public interface JobRepository extends JpaRepository <JobEntity,UUID> {
    
}
