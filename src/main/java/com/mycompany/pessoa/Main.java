package com.mycompany.pessoa;


import com.mycompany.pessoa.Pessoa;
import com.mycompany.pessoa.PessoaDAO;


public class Main {

 
    public static void main(String[] args) {
       
        PessoaDAO pessoaDAO = new PessoaDAO();
       
        Pessoa pessoa = new Pessoa("Luisa", 19);
        pessoaDAO.Adicionar(pessoa);
         
        Pessoa pessoa2 = new Pessoa("Isabella", 98);
        pessoaDAO.Adicionar(pessoa2);
        
        Pessoa pessoa3 = new Pessoa ("Vanessa", 47);
        pessoaDAO.Adicionar(pessoa3);
        
        System.out.print(pessoaDAO.getPessoa("Luisa"));
        System.out.print(pessoaDAO.getPessoa("Isabella"));
    }
    
}
