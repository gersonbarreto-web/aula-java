import java.util.Scanner;

public class Atv6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        String operador = sc.next();

        
        if (operador.equals("+")) {
            System.out.println(n1 + n2);
        } else if (operador.equals("-")) {
            System.out.println(n1 - n2);
        } else if (operador.equals("*")) {
            System.out.println(n1 * n2);
        } else if (operador.equals("/")) {
            System.out.println(n1 / n2);
        }

        sc.close();
    }
}