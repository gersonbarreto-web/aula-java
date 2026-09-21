package D4;
import java.util.Scanner;

public class PrincipalCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = null;
        String nomeAluno = "";
        double valorMatriculaPago = 0.0;
        boolean matriculaRealizada = false;

        while (true) {
            System.out.println("\n=== SISTEMA DE CURSOS E MATRÍCULAS ===");
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Escolher curso presencial ou online");
            System.out.println("3. Cadastrar nome do aluno");
            System.out.println("4. Realizar matrícula");
            System.out.println("5. Realizar matrícula com desconto");
            System.out.println("6. Mostrar dados do curso");
            System.out.println("7. Mostrar dados da matrícula");
            System.out.println("8. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                case 2:
                    System.out.println("\n--- Cadastro / Escolha de Curso ---");
                    System.out.println("Selecione o Tipo de Curso:");
                    System.out.println("1 - Curso Presencial");
                    System.out.println("2 - Curso Online");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); 

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Opção inválida! Operação cancelada.");
                        break;
                    }

                    System.out.print("Digite o código do curso: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do curso: ");
                    String nomeCurso = scanner.nextLine();

                    System.out.print("Digite a carga horária (em horas): ");
                    int cargaHoraria = scanner.nextInt();

                    System.out.print("Digite o valor do curso: R$ ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); 

                    if (tipo == 1) {
                        System.out.print("Digite o nome da sala: ");
                        String sala = scanner.nextLine();

                        System.out.print("Digite o turno (ex: Matutino/Noturno): ");
                        String turno = scanner.nextLine();

                        curso = new CursoPresencial(codigo, nomeCurso, cargaHoraria, valor, sala, turno);
                        System.out.println("Curso Presencial cadastrado com sucesso!");
                    } else {
                        System.out.print("Digite o endereço da plataforma (ex: https://plataforma.com): ");
                        String plataforma = scanner.nextLine();

                        System.out.print("Digite o código de acesso: ");
                        String codigoAcesso = scanner.nextLine();

                        curso = new CursoOnline(codigo, nomeCurso, cargaHoraria, valor, plataforma, codigoAcesso);
                        System.out.println("Curso Online cadastrado com sucesso!");
                    }
                    matriculaRealizada = false; 
                    break;

                case 3:
                    System.out.print("\nDigite o nome do aluno: ");
                    nomeAluno = scanner.nextLine();
                    System.out.println("Aluno '" + nomeAluno + "' registado no sistema com sucesso!");
                    break;

                case 4:
                    if (curso == null) {
                        System.out.println("Por favor, cadastre um curso antes de realizar a matrícula.");
                        break;
                    }
                    if (nomeAluno.trim().isEmpty()) {
                        System.out.print("Nome do aluno não encontrado. Digite o nome do aluno: ");
                        nomeAluno = scanner.nextLine();
                    }
                    valorMatriculaPago = curso.realizarMatricula(nomeAluno);
                    matriculaRealizada = true;
                    System.out.printf("Matrícula efetuada com sucesso! Valor total: R$ %.2f\n", valorMatriculaPago);
                    break;

                case 5:
                    if (curso == null) {
                        System.out.println("Por favor, cadastre um curso antes de realizar a matrícula.");
                        break;
                    }
                    if (nomeAluno.trim().isEmpty()) {
                        System.out.print("Nome do aluno não encontrado. Digite o nome do aluno: ");
                        nomeAluno = scanner.nextLine();
                    }
                    System.out.print("Informe o percentual de desconto (ex: 15 para 15%): ");
                    double desconto = scanner.nextDouble();

                    valorMatriculaPago = curso.realizarMatricula(nomeAluno, desconto);
                    matriculaRealizada = true;
                    System.out.printf("Matrícula com desconto efetuada! Valor final: R$ %.2f\n", valorMatriculaPago);
                    break;

                case 6:
                    System.out.println("\n--- Dados do Curso ---");
                    if (curso != null) {
                        System.out.println(curso.exibeDados());
                    } else {
                        System.out.println("Nenhum curso cadastrado no momento.");
                    }
                    break;

                case 7:
                    System.out.println("\n--- Dados da Matrícula ---");
                    if (curso == null) {
                        System.out.println("Nenhum curso cadastrado.");
                    } else if (nomeAluno.trim().isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else if (!matriculaRealizada) {
                        System.out.println("A matrícula ainda não foi finalizada. Escolha a opção 4 ou 5.");
                    } else {
                        System.out.println("Aluno: " + nomeAluno);
                        System.out.println("Curso: " + curso.getNome());
                        System.out.println("Informações do Curso: " + curso.exibeDados());
                        System.out.printf("Valor Final Pago: R$ %.2f\n", valorMatriculaPago);
                    }
                    break;

                case 8:
                    System.out.println("A encerrar o sistema de cursos... Até breve!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Selecione um número de 1 a 8.");
                    break;
            }
        }
    }
}