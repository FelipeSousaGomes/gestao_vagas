package br.com.felipe.gestao_vagas.modules.candidate.UsesCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.felipe.gestao_vagas.exceptions.UserFoundExcepetion;
import br.com.felipe.gestao_vagas.modules.candidate.entitites.CandidateEntity;
import br.com.felipe.gestao_vagas.modules.candidate.repositores.CandidateRepository;

@Service
public class CreateCandidateUseCase {

 @Autowired
  private CandidateRepository candidateRepository;

    public CandidateEntity execute (CandidateEntity candidateEntity){
 
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(),candidateEntity.getEmail())
    .ifPresent((user )-> {
      throw new UserFoundExcepetion();
    });


    return this.candidateRepository.save(candidateEntity);
    }
    
}
