package br.com.felipe.gestao_vagas.exceptions;

public class UserFoundExcepetion extends RuntimeException{
    public UserFoundExcepetion(){
        super("Usuario já existe");
    }

}
