import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;
        double MEDIA;

        MEDIA = ((A * pesoA)+(B * pesoB)+(C * pesoC)) / 10;

        System.out.printf("MEDIA = %.1f%n" , MEDIA);

        sc.close();
    }
}
