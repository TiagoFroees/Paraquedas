/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.ClienteDao;
import Model.Cliente;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tiago-PC
 */
@Named(value = "guiCliente")
@SessionScoped
public class GuiCliente implements Serializable {

    private List<Cliente> clientes;
    private Cliente cliente;
    private Boolean incluindo;

    @PersistenceContext
    ClienteDao daocliente;

    /**
     * Creates a new instance of GuiCliente
     */
    public GuiCliente() {
    }

    public String iniciarListaClientes() {
        clientes = daocliente.getClientes();
        return "LstClientes";

    }

    public String novoCliente() {
        cliente = new Cliente();
        incluindo = true;
        return "CadCLientes";

    }

    public String gravarCliente() {
        if (incluindo) {
            daocliente.incluir(cliente);
        } else {
            daocliente.alterar(cliente);
        }
        clientes = daocliente.getClientes();
        return "LstClientes";
    }

    public String excluir(Cliente cliente) {
        daocliente.excluir(cliente);
        clientes = daocliente.getClientes();
        return "LstClientes";
    }

}
