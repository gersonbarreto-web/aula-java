

import java.util.Scanner;

import D2.Carro;

public class CarroApp {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        Carro c =new Carro(null, null, 0);
        
        System.out.println("Digite a marca do carro: ");
        c.setMarca(sc.nextLine());

        System.out.println("Digite o modelo do carro: ");
        c.setModelo(sc.nextLine());
        
        System.out.println("Digite o ano de fabricação do carro: ");
        c.setAnofabricacao(sc.nextInt());

        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Ano de fabricação: " + c.getAnofabricacao());
    
        
        sc.close();
    }


    
}
