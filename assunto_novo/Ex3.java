import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("infomer um numero inteiro");
            int numero=sc.nextInt();
            System.out.println("Voce digitou ;"+numero);

        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro: Vove deve digitar um numero inteiro");
        }


        sc.close();
    }
}
