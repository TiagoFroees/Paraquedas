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
public class fornecedor extends pessoa {
    private Character cnpj;
    private Character contato;

    public Character getCnpj() {
        return cnpj;
    }

    public void setCnpj(Character cnpj) {
        this.cnpj = cnpj;
    }

    public Character getContato() {
        return contato;
    }

    public void setContato(Character contato) {
        this.contato = contato;
    }
    
}
