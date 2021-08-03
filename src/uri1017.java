import java.util.Locale;
import java.util.Scanner;

// Velocidade, distância e fórmula de tempo:
// V = S / T;   S = V * T;   T = S / V;
// onde V - velocidade, S - distância, T - tempo

public class uri1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        int Consumo = 12;
        double Litros;
        int Distancia;

        Distancia = velocidade * Tempo;
        Litros = (double)Distancia / Consumo;

        System.out.printf("%.3f%n",Litros);

        sc.close();
    }
}
