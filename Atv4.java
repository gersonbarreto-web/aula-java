import java.util.Scanner;

public class Atv4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe sua idade : ");
        int idade = sc.nextInt();

        if (idade >=18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }   
        sc.close();     
    }
}
