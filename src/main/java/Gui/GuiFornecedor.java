/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.FornecedorDao;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;
import modelV1.Fornecedor;

/**
 *
 * @author Tiago-PC
 */
@Named(value = "guiFornecedor")
@SessionScoped
public class GuiFornecedor implements Serializable {
    
    private List<Fornecedor>fornecedores;
    private Fornecedor fornecedor;
    private Boolean incluindo;
    
    
    @PersistenceContext
    FornecedorDao daofornecedor;

    /**
     * Creates a new instance of GuiFornecedor
     */
    public GuiFornecedor() {
    }
    
    public String iniciarListaFornecedores(){
       fornecedores = daofornecedor.getFornecedores();
          return "LstFornecedores";
                      
        }
    public String novoFornecedor(){
        fornecedor = new Fornecedor();
        incluindo = true;
        return "CadFornecedores";
        
    } 
    
    public String gravarFornecedor(){
        if(incluindo){
            daofornecedor.incluir(fornecedor);
        }else{
            daofornecedor.alterar(fornecedor);
        }
        fornecedores = daofornecedor.getFornecedores();
        return "LstFornecedores";
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
        
        
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }
    
    
    }
    

