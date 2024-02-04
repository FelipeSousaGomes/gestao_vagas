package br.com.felipe.gestao_vagas.modules.Company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.felipe.gestao_vagas.exceptions.UserFoundExcepetion;
import br.com.felipe.gestao_vagas.modules.Company.Entities.CompanyEntity;
import br.com.felipe.gestao_vagas.modules.Company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {
    
    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity){
        this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail()
        ).ifPresent(user -> {
            throw new UserFoundExcepetion();
        });
          return  this.companyRepository.save(companyEntity);
    }
}
