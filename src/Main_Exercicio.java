import java.util.Scanner;

public class Main_Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da largura do terreno: EX: 00,0 ");
        double larg = sc.nextDouble();
        System.out.println("Digite o valor do Comprimento do terreno: EX: 00,0 ");
        double comp = sc.nextDouble();
        System.out.println("Digite o valor do Preço do M2 do terreno: EX: 0000,00 ");
        double valorM2 = sc.nextDouble();
        System.out.println();


        double area = larg * comp;
        double preco = area * valorM2;


        System.out.println("Os dados digitados foram: ");
        System.out.println("O valor da Largura do terreno é : " + larg);
        System.out.println("O valor da Comprimento do terreno é : " + comp);
        System.out.println("O valor do Preço do M2 do terreno é R$: " + valorM2);
        System.out.println();
        System.out.printf("A area é: %.2f M2%n",area);
        System.out.printf("O preço é R$: %.2f%n",preco);

        sc.close();

        /*
        double larg = 10.0;
        double comp = 30.0;
        double valorM2 = 200.00;
        double area, preco;

        area = larg * comp;
        preco = area * valorM2;


        System.out.printf("Area: %.2f%n",area);
        System.out.printf("Preço: %.2f%n",preco);

         */

    }
}
