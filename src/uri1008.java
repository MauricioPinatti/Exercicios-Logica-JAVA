import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NUMBER = sc.nextInt();
        int HORAS = sc.nextInt();
        double valorH = sc.nextDouble();
        double SALARY;

        SALARY = HORAS * valorH;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n" ,SALARY);

        sc.close();
    }
}
