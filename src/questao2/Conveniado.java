package questao2;

public class Conveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATIS = 30;
    public static final double VALOR_HORA = 10.00;
    public static final double DESCONTO = 0.20; // 20%

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATIS);
        int horasIniciadas = (minutosCobrados + 59) / 60;
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO);
    }

    @Override
    public String getNome() { return "Conveniado"; }
}
