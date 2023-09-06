
package calcularimposto;


public class Pis extends ImpostoBase { // Classe Pis que implementa a interface Imposto e extende a classe abstrata imposto base.
    private double debito;
    private double credito;
    
    public Pis(double debito, double credito) { // Construtor Pis.
        super(0); // O valor não é usado no cálculo do PIS.
        this.debito = debito;
        this.credito = credito;
    }
    
    @Override // indica que o metodo esta sendo subrescrito da classe pai.
    public double calcular() {
        return (debito - credito) * 0.0165;
    }
    
    @Override // indica que o metodo esta sendo subrescrito da classe pai.
    public String descricao() {
        return "Pis";
    }
}
