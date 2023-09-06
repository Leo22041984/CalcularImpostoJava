
package calcularimposto;

public abstract class ImpostoBase implements Imposto { // Classe abstrata que faz a implementação da interface Imposto.
    protected double valor;
    
    public ImpostoBase(double valor) { // Construtor ImpostoBase.
        this.valor = valor;
    }
}
