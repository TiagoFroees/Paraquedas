/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.ProdutoDao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;
import Model.Produto;

/**
 *
 * @author Tiago-PC
 */
@Named(value = "guiProduto")
@SessionScoped
public class GuiProduto implements Serializable {
    
    private List<Produto>produtos;
    private Produto produto;
    private Boolean incluindo;
    
    
    @PersistenceContext
    ProdutoDao daoproduto;

    /**
     * Creates a new instance of GuiProduto
     */
    public GuiProduto() {
    }
           
    public String iniciarListaProdutos(){
       produtos = daoproduto.getProdutos();
          return "LstProdutos";
                      
    }
    public String novoProduto(){
        produto = new Produto();
        incluindo = true;
        return "CadProdutos";
        
    } 
    
    public String gravarProduto(){
        if(incluindo){
            daoproduto.incluir(produto);
        }else{
            daoproduto.alterar(produto);
        }
        produtos = daoproduto.getProdutos();
        return "LstProdutos";
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }

    
}
