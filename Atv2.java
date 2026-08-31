import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMaximo = 5;
        int [] numeros = new int [tamanhoMaximo];
        int quantidade = 0;
        int opcao = 0;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Inserir numero");
            System.out.println("2 - Listar numeros");
            System.out.println("3 - Remover numero");
            System.out.println("4 - sair");
            System.out.println(" Escolha uma opcao");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:    
                    if (quantidade >= tamanhoMaximo) {
                        System.out.println("Erro esta cheio! Nao e possivel");
                    } else {
                        System.out.println("Digite o numero que deseja inserir");
                        int novoNumero = scanner.nextInt();
                        numeros[quantidade] = novoNumero;
                        quantidade++;

                        System.out.println("Numero inserido com sucesso!");

                    }
                    break;
                case 2:
                    if (quantidade == 0) {
                        System.out.println("nao ha numeros cadastrados");
                    }else {
                        System.out.println("\n --- LISTA DE NUMEROS ---");
                        for (int i = 0; i < quantidade; i++){
                            System.out.println("Indice [" + i + "]:" + numeros[i]);

                        }
                    }
                    break;

                case 3 :
                    if (quantidade ==0){
                        System.out.println("Erro nao ha numeros cadastrados para remover");
                    }else{
                        System.out.println("informe o indice do numero que deseja remover");
                        int indiceRemover = scanner.nextInt();

                        if (indiceRemover <0|| indiceRemover>=quantidade){
                            System.out.println("Erro indice invalido!");
                        }else{
                            for (int i = indiceRemover; i < quantidade -1; i++){
                                numeros[i] = numeros[i +1];


                            }
                            
                            quantidade--;
                            System.out.println("Numero removido com sucesso!");
                        }

                    } 
                    break;
                case 4 :
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        } while (opcao !=4);
        scanner.close(); {
            
        }
    }
}
