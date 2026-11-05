package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        areas.add(area);
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return; // RQ1.4: nao mudou, nao avisa ninguem
        }
        this.quantidade = novaQuantidade;
        notificarAreas();
    }

    private void notificarAreas() {
        for (AreaInteressada area : areas) {
            area.atualizar(nome, quantidade);
        }
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
}
