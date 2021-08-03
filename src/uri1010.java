import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Cod1 = sc.nextInt();
        int Peca1 = sc.nextInt();
        double Valor1 = sc.nextDouble();
        int Cod2 = sc.nextInt();
        int Peca2 = sc.nextInt();
        double Valor2 = sc.nextDouble();
        double Total1,Total2,Soma;

        Total1 = Peca1 * Valor1;
        Total2 = Peca2 * Valor2;
        Soma = Total1 + Total2;


        System.out.printf("VALOR A PAGAR: R$ %.2f%n", Soma);

        sc.close();
    }
}
