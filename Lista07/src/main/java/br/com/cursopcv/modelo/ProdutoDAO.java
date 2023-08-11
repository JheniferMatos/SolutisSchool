package br.com.cursopcv.modelo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ProdutoDAO {

    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    // Cadastrar Produtos
    public void cadastrarProduto(Produto p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    // Atualizar Produto
    public void atualizarProduto(Produto p, EntityTransaction transaction) {
        try {
            em.merge(p);
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Remover Produto
    public void removerProduto(Produto p, EntityTransaction transaction) {
        try {
            em.remove(p);
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
