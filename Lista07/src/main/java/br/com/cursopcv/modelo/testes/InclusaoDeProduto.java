package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Encapsulamento;
import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDAO;
import jakarta.persistence.EntityManager;


public class InclusaoDeProduto {
    public static void main(String[] args) {
        
        EntityManager em = Encapsulamento.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Produto panela = new Produto();
        panela.setNome("Panela");
        panela.setDescricao("Panela de Pressão 10 Litros");
        panela.setPreco(56.80);

        Produto cama = new Produto();
        cama.setNome("Cama");
        cama.setDescricao("Cama de casal Big");
        cama.setPreco(450.68);

        Produto caixaSom = new Produto();
        caixaSom.setNome("Caixa Som");
        caixaSom.setDescricao("Caixa de Som JBL");
        caixaSom.setPreco(160.00);

        produtoDAO.cadastrarProduto(panela);
        produtoDAO.cadastrarProduto(cama);
        produtoDAO.cadastrarProduto(caixaSom);

        em.close();
        Encapsulamento.closeEntityManagerFactory();
    }
}
