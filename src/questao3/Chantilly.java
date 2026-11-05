package questao3;

public class Chantilly extends Complemento {
    public Chantilly(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebida.getDescricao() + " + Chantilly"; }
    public double getPreco() { return bebida.getPreco() + 2.00; }
}
