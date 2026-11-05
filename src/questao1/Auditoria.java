package questao1;

public class Auditoria implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[AUDITORIA] Registro: estoque de " + nomeProduto + " alterado para " + novaQuantidade);
    }
}
