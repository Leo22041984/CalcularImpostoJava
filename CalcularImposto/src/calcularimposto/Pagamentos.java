
package calcularimposto;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos { // Classe que faz a implementação dos calculos realizados para o pagamento dos impostos.
    private String nomeEmpresa;
    private List<Imposto> impostos; //criação da lista
    
    public Pagamentos(String nomeEmpresa) { // Construtor Pagamentos 
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }
    
    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto); // metodo utilizado para adicionar um componente ao recepitor.
    }
    
    public void calcularImpostos() {
        for (Imposto imposto : impostos) {
            double valor = imposto.calcular();
            String descricao = imposto.descricao();
            System.out.println("Empresa: " + nomeEmpresa);
            System.out.println("Imposto: " + descricao);
            System.out.println("Total calculado: R$" + valor);
        }
    }

    
}

