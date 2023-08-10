public class Main {
    public static void main(String[] args) {
        // Testando a classe Pessoa
        Pessoa pessoa = new Pessoa("João da Silva", "Rua A, 123", "(11) 98765-4321");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println();

        // Testando a classe Fornecedor
        Fornecedor fornecedor = new Fornecedor("Maria Souza", "Avenida B, 456", "(11) 12345-6789", 5000.0, 2000.0);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        System.out.println();

        // Testando a classe Empregado
        Empregado empregado = new Empregado("José Santos", "Rua C, 789", "(11) 98765-4321", 123, 2000.0, 10.0);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
        System.out.println();

        // Testando a classe Administrador
        Administrador administrador = new Administrador("Ana Oliveira", "Avenida D, 987", "(11) 12345-6789", 456, 3000.0, 15.0, 500.0);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
        System.out.println();

        // Testando a classe Operario
        Operario operario = new Operario("Carlos Gomes", "Rua E, 321", "(11) 98765-4321", 789, 2500.0, 10.0, 10000.0, 2.5);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
        System.out.println();

        // Testando a classe Vendedor
        Vendedor vendedor = new Vendedor("Roberta Sales", "Avenida F, 654", "(11) 12345-6789", 987, 3000.0, 12.0, 50000.0, 5.0);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
        System.out.println();
    }
}
