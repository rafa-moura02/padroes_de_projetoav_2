package questao1;

public class Compras implements AreaInteressada {
    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("[COMPRAS] ALERTA: " + nomeProduto + " com estoque baixo (" + novaQuantidade + " un.). Repor!");
        }
    }
}
