import java.util.Scanner;

public class Conde3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa a idade:");
        int idade = sc.nextInt();

        System.out.println("E estudante? Digite 1 para sim e 2 para nao:");
        int estudante = sc.nextInt();

        if (idade>=60 || estudante==1) {
            System.out.println("tem direito aou desconto");
        } else {
            System.out.println("nao tem direito ao desconto");
        }
        sc.close();
    }
}
