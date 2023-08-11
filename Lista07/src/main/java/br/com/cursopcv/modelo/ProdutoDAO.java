package br.com.cursopcv.modelo;

import jakarta.persistence.EntityManager;

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
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    // Atualizar Produto
    public void atualizarProduto(Produto p) {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    // Remover Produto
    public void removerProduto(Produto p) {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
