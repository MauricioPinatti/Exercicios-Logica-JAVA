import java.util.Scanner;

public class Main_04 {


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x;
            String s1, s2, s3;

            x = sc.nextInt();
            sc.nextLine();      // se não colocar esse nextLine() ele le a variavel x, a hr q apertar "ENTER" ele "lê" esse enter e nao pega a ultima variavel
            s1 = sc.nextLine(); //para ler a linha que foi digitado até apertar "ENTER"
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("DADOS DIGITADOS:");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            sc.close();
        }
    }
