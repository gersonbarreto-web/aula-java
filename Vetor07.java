import java.util.Scanner;

public class Vetor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nome;
        int [] idades;

        System.out.println("Quantas pessoas deseja cadastrar");
        int qunatidades = sc.nextInt();

        nome = new String[qunatidades];
        idades = new int [qunatidades];

        for(int i=0;i<qunatidades;i++){
            System.out.println("Digite o nome");
            nome[i]=sc.nextLine();

            System.out.println("Digite a idade ");
            idades[i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<qunatidades;i++){
            System.out.println(nome[i]+" - "+idades[i]+"anos");
        }
        sc.close();
    }

}
