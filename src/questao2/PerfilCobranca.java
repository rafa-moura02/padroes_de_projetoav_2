package questao2;

// Strategy: cada perfil sabe calcular o proprio valor
public interface PerfilCobranca {
    double calcular(int minutos);
    String getNome();
}
