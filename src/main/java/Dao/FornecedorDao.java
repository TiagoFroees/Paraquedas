/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelV1.Fornecedor;

/**
 *
 * @author Tiago-PC
 */
public class FornecedorDao {
    
    
    @PersistenceContext
    EntityManager em;

    public void incluir(Fornecedor fornecedor) {
        em.persist(fornecedor);
    }
    public void alterar(Fornecedor fornecedor) {
        em.merge(fornecedor);
    }
    public void excluir(Fornecedor fornecedor) {
        em.remove(em.merge(fornecedor));
    }

    public List<Fornecedor> getFornecedores() {
        Query  q = em.createQuery("Select f from Fornecedor f");
        return q.getResultList();
    }
}
