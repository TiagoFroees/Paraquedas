/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.FuncionarioDao;
import Model.Funcionario;
import Model.Pessoa;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tiago-PC
 */
@Named(value = "guiFuncionario")
@SessionScoped
public class GuiFuncionario implements Serializable {

    private List<Funcionario> funcionarios;
    private Funcionario funcionario;
    private Boolean incluindo;

    @PersistenceContext
    FuncionarioDao daofuncionario;

    /**
     * Creates a new instance of GuiFuncionario
     */
    public GuiFuncionario() {
    }

    public String iniciarListaFuncionarios() {
        funcionarios = daofuncionario.getFuncionarios();
        return "LstFuncionarios";

    }

    public String novoFuncionario() {
        funcionario = new Funcionario();
        incluindo = true;
        return "CadFuncionarios";

    }

    public String gravarFuncionario() {
        if (incluindo) {
            daofuncionario.incluir(funcionario);
        } else {
            daofuncionario.alterar(funcionario);
        }
        funcionarios = daofuncionario.getFuncionarios();
        return "LstFuncionarios";
    }

    public String excluir(Funcionario funcionario) {
        daofuncionario.excluir(funcionario);
        funcionarios = daofuncionario.getFuncionarios();
        return "LstFuncionarios";
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    

}
