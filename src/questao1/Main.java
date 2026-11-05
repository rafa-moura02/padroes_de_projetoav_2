package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("--- Estoque 10 -> 7 ---");
        notebook.setQuantidade(7);

        System.out.println("--- Estoque 7 -> 3 (Compras alerta) ---");
        notebook.setQuantidade(3);

        System.out.println("--- Estoque 3 -> 3 (nao mudou, ninguem e avisado) ---");
        notebook.setQuantidade(3);

        System.out.println("--- Estoque 3 -> 0 ---");
        notebook.setQuantidade(0);

        System.out.println("--- Estoque 0 -> 20 (Vendas alerta) ---");
        notebook.setQuantidade(20);

        System.out.println("--- Removendo Auditoria ---");
        notebook.removerArea(auditoria);

        System.out.println("--- Estoque 20 -> 2 (Auditoria nao recebe mais) ---");
        notebook.setQuantidade(2);
    }
}
