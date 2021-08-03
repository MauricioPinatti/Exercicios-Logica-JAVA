import java.util.Locale;
import java.util.Scanner;

// media ponderada =  "nota" "*" o "peso" dividido pelo valor total dos "pesos"

public class uri1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;
        double MEDIA;

        MEDIA = ((A * pesoA)+(B * pesoB)) / 11;

        System.out.printf("MEDIA = %.5f%n" , MEDIA);

        sc.close();
    }
}
