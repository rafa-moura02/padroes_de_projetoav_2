package questao3;

// Decorator: "embrulha" uma bebida e soma descricao + preco
public abstract class Complemento implements Bebida {
    protected Bebida bebida;

    public Complemento(Bebida bebida) {
        this.bebida = bebida;
    }
}
