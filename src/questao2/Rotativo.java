package questao2;

public class Rotativo implements PerfilCobranca {
    public static final double VALOR_HORA = 10.00;

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (minutos + 59) / 60; // arredonda pra cima
        return horasIniciadas * VALOR_HORA;
    }

    @Override
    public String getNome() { return "Rotativo"; }
}
