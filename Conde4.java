import java.util.Scanner;
public class Conde4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa a idade :");
        int idade = sc.nextInt();

        if (idade <=12) {
            System.out.println("crianca");
        } else if (idade<18 ) {
            System.out.println("adolescente");
        } else if (idade<60 ) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
        sc.close();
    }
}
