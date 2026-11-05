package questao1;

import java.util.HashMap;
import java.util.Map;

public class Vendas implements AreaInteressada {
    
    private Map<String, Boolean> estavaZerado = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        boolean zeradoAntes = estavaZerado.getOrDefault(nomeProduto, false);

        if (zeradoAntes && novaQuantidade > 0) {
            System.out.println("[VENDAS] ALERTA: " + nomeProduto + " voltou ao estoque (" + novaQuantidade + " un.). Pode vender!");
        }
        estavaZerado.put(nomeProduto, novaQuantidade == 0);
    }
}
