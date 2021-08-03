import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String Nome = sc.next();
        double Salario = sc.nextDouble();
        double TotalVendas = sc.nextDouble();
        int Comissao = 15 ;
        double Total;

        Total = ((Comissao * TotalVendas) / 100) + Salario;

        System.out.printf("TOTAL = R$ %.2f%n" ,Total);

        sc.close();
    }
}
