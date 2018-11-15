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
import Model.Pessoa;

/**
 *
 * @author Tiago-PC
 */
public class PessoaDao {

    @PersistenceContext
    EntityManager em;

    public void incluir(Pessoa pessoa) {
        em.persist(pessoa);
    }
    public void alterar(Pessoa pessoa) {
        em.merge(pessoa);
    }
    public void excluir(Pessoa pessoa) {
        em.remove(em.merge(pessoa));
    }

    public List<Pessoa> getPessoas() {
        Query  q = em.createQuery("Select p from Pessoa p");
        return q.getResultList();
    }
}
