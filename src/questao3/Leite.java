package questao3;

public class Leite extends Complemento {
    public Leite(Bebida bebida) { super(bebida); }

    public String getDescricao() { return bebida.getDescricao() + " + Leite"; }
    public double getPreco() { return bebida.getPreco() + 1.50; }
}
