
package calcularimposto;

public class Ipi extends ImpostoBase { // Classe que implementa a interface Imposto e extende a classe abstrata ImpostoBase.
    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;
    
    public Ipi(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) { //Construtor Ipi
        super(valorProduto + frete + seguro + outrasDespesas);
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }
    
    @Override // indica que o metodo esta sendo subrescrito da classe pai.
    public double calcular() {
        return valor * aliquota / 100;
    }
    
    @Override // indica que o metodo esta sendo subrescrito da classe pai.
    public String descricao() {
        return "Ipi";
    }
}

