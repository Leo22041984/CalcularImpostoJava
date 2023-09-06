/*Atividade
Crie um projeto Java no NetBeans. Observe com atenção as características em comum entre os impostos e considere a utilização de hierarquia de classes com interfaces. Desenvolva as classes e interfaces e um programa em main(), para testar.
Crie um objeto de “Pagamentos” para o qual o usuário informará dados.
Permita que o usuário cadastre na lista de “Pagamentos” uma lista de impostos que possa receber ambos os tipos expostos no contexto. Não há um limite para a quantidade de impostos registrados – o usuário deve cadastrar vários consecutivos, informando o tipo de imposto e os valores necessários; informará “pare” para encerrar a entrada de dados de impostos.
Ao fim do cadastramento, independentemente do tipo, mostre o total calculado para cada um dos impostos cadastrados e também mostrar a descrição deles.
Para cada classe criada, use encapsulamento (get/set) e desenvolva construtores e outros métodos sempre que necessário ou conveniente.*/

package calcularimposto;


import java.util.Scanner;

public class CalcularImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        
        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);
        
        while (true) {
            System.out.print("Digite o tipo de imposto (Pis ou Ipi) ou 'pare' para encerrar: ");
            String tipoImposto = scanner.nextLine();
            
            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }
            
            if (tipoImposto.equalsIgnoreCase("Pis")) {
                System.out.print("Digite o valor total de débito: ");
                double debito = scanner.nextDouble();
                
                System.out.print("Digite o valor total de crédito: ");
                double credito = scanner.nextDouble();
                
                scanner.nextLine(); // Limpar o buffer
                
                Pis pis = new Pis(debito, credito);
                pagamentos.adicionarImposto(pis);
                
            } else if (tipoImposto.equalsIgnoreCase("Ipi")) {
                System.out.print("Digite o valor do produto: ");
                double valorProduto = scanner.nextDouble();
                
                System.out.print("Digite o valor do frete: ");
                double frete = scanner.nextDouble();
                
                System.out.print("Digite o valor do seguro: ");
                double seguro = scanner.nextDouble();
                
                System.out.print("Digite o valor de outras despesas: ");
                double outrasDespesas = scanner.nextDouble();
                
                System.out.print("Digite a alíquota: ");
                double aliquota = scanner.nextDouble();
                
                scanner.nextLine(); // Limpar o buffer
                
                Ipi ipi = new Ipi(valorProduto, frete, seguro, outrasDespesas, aliquota);
                pagamentos.adicionarImposto(ipi);
                
            } else {
                System.out.println("Tipo de imposto inválido. Tente novamente.");
            }
        }
        
        System.out.println("--- Resultado ---");
        pagamentos.calcularImpostos();
    }
}

