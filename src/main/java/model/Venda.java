/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lourdes
 */
public class Venda {
    
    private LocalDate data;
    private LocalDate hora;
    private Float valortotal;
    private Pagamento pagamento;
    private Cliente cliente;
    private Funcionario funcionario;
    private List <ItemVenda> itemvendas;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public Float getValortotal() {
        return valortotal;
    }

    public void setValortotal(Float valortotal) {
        this.valortotal = valortotal;
    }
    
    
    
}
