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
public class produto {
    
    private Character nome;
    private Character modelo;
    private Integer CodProduto;
    private Integer Estoque;

    public Character getNome() {
        return nome;
    }

    public void setNome(Character nome) {
        this.nome = nome;
    }

    public Character getModelo() {
        return modelo;
    }

    public void setModelo(Character modelo) {
        this.modelo = modelo;
    }

    public Integer getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(Integer CodProduto) {
        this.CodProduto = CodProduto;
    }

    public Integer getEstoque() {
        return Estoque;
    }

    public void setEstoque(Integer Estoque) {
        this.Estoque = Estoque;
    }
    
    
}
