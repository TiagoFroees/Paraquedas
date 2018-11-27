/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author aluno
 */
@Entity
public class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate dataPagamento;
    private Float valorPago;
    
    @OneToMany
    private List<FormaPgto>formapgtos;

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public List<FormaPgto> getFormapgtos() {
        return formapgtos;
    }

    public void setFormapgtos(List<FormaPgto> formapgtos) {
        this.formapgtos = formapgtos;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pagamento other = (Pagamento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataPagamento, other.dataPagamento)) {
            return false;
        }
        if (!Objects.equals(this.valorPago, other.valorPago)) {
            return false;
        }
        if (!Objects.equals(this.formapgtos, other.formapgtos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", dataPagamento=" + dataPagamento + ", valorPago=" + valorPago + ", formapgtos=" + formapgtos + '}';
    }

    
}
