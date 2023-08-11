package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDAO;

import jakarta.persistence.EntityManager;

public class AlteracaoDeProduto {
    public static void main(String[] args) {

        EntityManager em = Encapsulamento.getEntityManager();
        
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        // Iniciar transação
        em.getTransaction().begin();

        // Buscar o segundo produto pelo código (2)
        Produto produto = em.find(Produto.class, 2L);

        // Alterar o preço do produto
        if (produto != null) {
            produto.setPreco(345.00);
            produtoDAO.atualizarProduto(produto, em.getTransaction());
        }

        // Comitar transação
        em.getTransaction().commit();

        em.close();
        Encapsulamento.closeEntityManagerFactory();
    }
}
