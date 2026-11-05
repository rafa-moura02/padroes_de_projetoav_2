package questao3;

public class Calda extends Complemento {
    public Calda(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebida.getDescricao() + " + Calda"; }
    public double getPreco() { return bebida.getPreco() + 1.00; }
}
