import java.util.Scanner;

public class Main_03 {

    // entrada de dados via teclado

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }
}

        /*
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0); // .next().charAT() é para ler uma variavel tipo CHAR, o num "0" diz qual posição do que foi digitado vai ler
        System.out.println("Você digitou: " + x);

        sc.close(); */

        /*

        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble(); // .nextDouble() é para ler uma variavel tipo PONTO FLUTUANTE
        System.out.println("Você digitou: " + x);

        sc.close();

        // TEM QUE DIGITAR NUMERO COM "," SE DIGITAR COM "." DA ERRO
        // PARA DIGITAR COM "." TEM QUE IMPORTAR O "LOCALE.SETDEFAUT(LOCALE.US);
        // PARA CONFIGURAR A IMPRESSÃO COM "," TEM QUE USAR O "PRINF" E CONFIGURAR COM O %f


         */

        /*
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt(); // .nextInt() é para ler uma variavel tipo INTEIRO
        System.out.println("Você digitou: " + x);

        sc.close(); */


        /*
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next(); // .next() é para ler uma variavel tipo STRING
        System.out.println("Você digitou: " + x);

        sc.close(); */
