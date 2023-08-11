package br.com.cursopcv.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod", nullable = false, unique = true)
    private Long cod;

    @Column(length = 100, nullable = false)
    private String nome, descricao;

    @Column(name= "preco", nullable = false)
    private double preco;

    //Getters Setters Construtores


    public Produto(Long cod, String nome, String descricao, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }


    public Long getCod() {
        return this.cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    

    

}
