package questao2;

// Context: o ticket nao sabe a regra, so delega para o perfil atual
public class Ticket {
    private String placa;
    private int minutos;
    private PerfilCobranca perfil;

    public Ticket(String placa, int minutos, PerfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil; // troca de perfil em tempo de execucao
    }

    public double calcularValor() {
        return perfil.calcular(minutos); // sem if/switch
    }

    public void imprimir() {
        System.out.printf("Placa %s | %d min | %s -> R$ %.2f%n",
                placa, minutos, perfil.getNome(), calcularValor());
    }
}
