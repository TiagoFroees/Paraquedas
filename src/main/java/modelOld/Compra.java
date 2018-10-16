/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelOld;


import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lourdes
 */
public class Compra {
    private LocalDate data;
    private Float valorTotal;
    private Fornecedor fornecedor;
    private List <ItemCompra> compras;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
