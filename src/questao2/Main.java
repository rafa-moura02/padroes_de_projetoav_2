package questao2;

public class Main {
    public static void main(String[] args) {
        int tempo = 130; // 2h10min

        System.out.println("--- Mesmo tempo nos tres perfis ---");
        new Ticket("ABC-1234", tempo, new Rotativo()).imprimir();
        new Ticket("DEF-5678", tempo, new Mensalista()).imprimir();
        new Ticket("GHI-9012", tempo, new Conveniado()).imprimir();

        System.out.println("--- Troca de perfil no mesmo ticket ---");
        Ticket ticket = new Ticket("XYZ-0001", tempo, new Rotativo());
        ticket.imprimir();
        ticket.setPerfil(new Conveniado());
        ticket.imprimir();
        ticket.setPerfil(new Mensalista());
        ticket.imprimir();
    }
}
