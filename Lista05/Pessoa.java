/*Cria uma Classe Pessoa, contendo os atributos encapsulados, 
com seus respectivos seletores (getters) e modificadores (setters), 
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. 
Atributos: String nome; String endereço; String telefone; */

public class Pessoa {
    private String nome, endereco, telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    //Getters e Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
