/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lourdes
 */
public class pessoa {
    private Character nome;
    private Character cpf;
    private Character telefone;
    private Character email;
    private Character dataNasc;
    private Character end;
    private Integer IdPessoa;

    public Character getNome() {
        return nome;
    }

    public void setNome(Character nome) {
        this.nome = nome;
    }

    public Character getCpf() {
        return cpf;
    }

    public void setCpf(Character cpf) {
        this.cpf = cpf;
    }

    public Character getTelefone() {
        return telefone;
    }

    public void setTelefone(Character telefone) {
        this.telefone = telefone;
    }

    public Character getEmail() {
        return email;
    }

    public void setEmail(Character email) {
        this.email = email;
    }

    public Character getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Character dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Character getEnd() {
        return end;
    }

    public void setEnd(Character end) {
        this.end = end;
    }

    public Integer getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(Integer IdPessoa) {
        this.IdPessoa = IdPessoa;
    }
    
    
}
