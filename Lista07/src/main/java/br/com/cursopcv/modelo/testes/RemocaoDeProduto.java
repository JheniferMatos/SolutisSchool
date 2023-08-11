package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RemocaoDeProduto {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contestoque");
        EntityManager em = emf.createEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        // Iniciar transação
        em.getTransaction().begin();

        // Buscar o terceiro produto pelo código (3)
        Produto produto = em.find(Produto.class, 3L);

        // Remover o produto
        if (produto != null) {
            produtoDAO.removerProduto(produto);
        }

        // Comitar transação
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
