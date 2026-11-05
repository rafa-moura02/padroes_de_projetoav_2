package questao3;

public class Main {
    public static void main(String[] args) {
        // Pedido 1: Espresso com Leite
        Bebida pedido1 = new Leite(new Espresso());

        // Pedido 2: Cha com Calda e Chantilly
        Bebida pedido2 = new Chantilly(new Calda(new Cha()));

        // Pedido 3: Espresso com Leite duplo e Chantilly (complemento repetido)
        Bebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso())));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
    }

    private static void imprimir(Bebida b) {
        System.out.printf("%s -> R$ %.2f%n", b.getDescricao(), b.getPreco());
    }
}
