import java.util.Scanner;

public class uri1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, resto, cem, cinquenta, vinte, dez, cinco, dois,um;

        N = sc.nextInt();

        cem = N / 100;
        resto = N % 100;

        cinquenta = resto / 50;
        resto = resto % 50;

        vinte = resto / 20;
        resto = resto % 20;

        dez = resto / 10;
        resto = resto % 10;

        cinco = resto / 5;
        resto = resto % 5;

        dois = resto / 2;
        resto = resto % 2;

        um = resto / 1;


        System.out.println(N);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");


        sc.close();
    }
}

/*  outra forma de resolver

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, quociente, resto, nota;

		N = sc.nextInt();
		System.out.println(N);

		resto = N;

		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		System.out.println(resto + " nota(s) de R$ 1,00");

		sc.close();
	}
 */