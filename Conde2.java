import java.util.Scanner;
public class Conde2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa a nota do aluno:");
        double nota = sc.nextDouble();

        System.out.println("informa a frequencia do aluno:");
        double frequencia = sc.nextDouble();

        if (nota >=7 && frequencia >= 75) {
            System.out.println("aprovadp");
        } else {
            System.out.println("reprovado");
            
        }
        
        sc.close();
    }

}
