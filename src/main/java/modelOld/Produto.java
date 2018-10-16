/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelOld;

/**
 *
 * @author Lourdes
 */
public class Produto {
    
    private String nome;
    private String modelo;
    private Integer CodProduto;
    private Integer Estoque;
    private Categoria categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
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
