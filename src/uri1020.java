import java.util.Scanner;

public class uri1020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, resto , quociente, ano, mes, dia;

        N = sc.nextInt();

        resto = N;

        ano = 365;
        quociente = resto / ano;
        System.out.println(quociente + " ano(s)");
        resto = resto % ano;

        mes = 30;
        quociente = resto / mes;
        System.out.println(quociente + " mes(es)");
        resto = resto % mes;

        dia = resto;
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
