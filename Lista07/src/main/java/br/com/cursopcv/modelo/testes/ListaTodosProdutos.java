package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Encapsulamento;
import br.com.cursopcv.modelo.Produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ListaTodosProdutos {
    public static void main(String[] args) {
        EntityManager em = Encapsulamento.getEntityManager();

        // Iniciar transação
        em.getTransaction().begin();

        // Consulta para listar todos os produtos
        TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
        List<Produto> produtos = query.getResultList();

        // Exibindo os produtos
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCod());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("===========================");
        }

        // Comitar transação
        em.getTransaction().commit();

        em.close();
        Encapsulamento.closeEntityManagerFactory();
    }
}
