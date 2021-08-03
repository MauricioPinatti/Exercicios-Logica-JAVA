import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double Triangulo, Circulo, Trapezio, Quadrado, Retangulo;

        Triangulo = (A * C) / 2.0;
        Circulo = pi * Math.pow(C, 2.0);
        Trapezio = ((A + B) * C) / 2;
        Quadrado = Math.pow(B, 2.0);
        Retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", Triangulo);
        System.out.printf("CIRCULO: %.3f%n", Circulo);
        System.out.printf("TRAPEZIO: %.3f%n", Trapezio);
        System.out.printf("QUADRADO: %.3f%n", Quadrado);
        System.out.printf("RETANGULO: %.3f%n", Retangulo);

        sc.close();
    }
}
