package com.mycompany.pessoa;


import java.util.ArrayList;

public class PessoaDAO {
    
    ArrayList<Pessoa> pessoas = new ArrayList();
    
    public void Adicionar(Pessoa p) {
    
        pessoas.add(p);
        
    }
    
    public ArrayList getPessoa(String nome) {
    
        ArrayList<Pessoa> nomePessoa = new ArrayList();
        
        for(Pessoa pessoa: pessoas) {
            if(pessoa.getNome() == nome)
                nomePessoa.add(pessoa);
        }
        return nomePessoa;
    }
    
    public void  MenorTrinta() {
        
        ArrayList<Pessoa> pessoasMenorTrinta = new ArrayList();
        
        for(Pessoa pessoa: pessoas){        
            if(pessoa.getIdade()<30){
                System.out.println(pessoa);
                pessoasMenorTrinta.add(pessoa);
            }
        }
        
        if(pessoasMenorTrinta.isEmpty())
            System.out.println("Não existem pessoas com menos de trinta anos");           
    
    }
    
    
    
    
    
}
