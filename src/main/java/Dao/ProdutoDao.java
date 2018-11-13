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
import modelV1.Produto;

/**
 *
 * @author Tiago-PC
 */
public class ProdutoDao {
    
    
    @PersistenceContext
    EntityManager em;

    public void incluir(Produto produto) {
        em.persist(produto);
    }
    public void alterar(Produto produto) {
        em.merge(produto);
    }
    public void excluir(Produto produto) {
        em.remove(em.merge(produto));
    }

    public List<Produto> getProdutos() {
        Query  q = em.createQuery("Select p from Produto p");
        return q.getResultList();
    }
    
}
