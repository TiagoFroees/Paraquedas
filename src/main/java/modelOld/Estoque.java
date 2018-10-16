/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelOld;

import java.util.List;

/**
 *
 * @author Lourdes
 */
public class Estoque {
    private Integer quantidade;
    private Integer codEstoque;
    private Cor cor;
    private Tamanho tamanho;
   
    private List<Produto> produtos;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(Integer codEstoque) {
        this.codEstoque = codEstoque;
    }
    
}
