/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Tiago-PC
 */
public class FuncionarioDao {

    @PersistenceContext
    EntityManager em;

    public void incluir(Funcionario funcionario) {
        em.persist(funcionario);
    }

    public void alterar(Funcionario funcionario) {
        em.merge(funcionario);
    }

    public void excluir(Funcionario funcionario) {
        em.remove(em.merge(funcionario));
    }

    public List<Funcionario> getFuncionarios() {
        Query q = em.createQuery("Select f from Pessoa f");
        return q.getResultList();
    }

}
