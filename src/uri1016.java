import java.util.Scanner;

public class uri1016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int VelY = 90;
        int Tempo = 60;
        int Deslocamento = 2;
        int Distancia;

        Distancia = Deslocamento * Y;

        System.out.println(Distancia + " minutos");

        sc.close();
    }
}
