package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDAO;

import jakarta.persistence.EntityManager;


public class RemocaoDeProduto {
    public static void main(String[] args) {

        EntityManager em = Encapsulamento.getEntityManager();
        
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        // Iniciar transação
        em.getTransaction().begin();

        // Buscar o terceiro produto pelo código (3)
        Produto produto = em.find(Produto.class, 3L);

        // Remover o produto
        if (produto != null) {
            produtoDAO.removerProduto(produto, em.getTransaction()); // Passando a transação como parâmetro
        }


        // Comitar transação
        em.getTransaction().commit();

        em.close();
        Encapsulamento.closeEntityManagerFactory();
    }
}
