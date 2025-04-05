import java.util.Scanner;

public class ControleDeNotas {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);

        int limiteCadastro = 50;
        int contadorDeAlunos = 0;

        String[] nomeAluno = new String[limiteCadastro];
        double[] mediaAluno = new double[limiteCadastro];

        while (true) {

            System.out.println("\n***MENU***");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Ver lista de cadastrados");
            System.out.println("3 - Média da turma");
            System.out.println("4 - Resultados");
            System.out.println("\n***NEW***");
            System.out.println("5 - Cadastrar uma nova turma");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção: ");
            int escolha = cadastro.nextInt();
            cadastro.nextLine();

            if (escolha == 1) {

                System.out.println("Quantos alunos deseja cadastrar? ");
                int quantidade = cadastro.nextInt();
                cadastro.nextLine();


                for (int i = 0; i < quantidade; i++) {


                    if (contadorDeAlunos < limiteCadastro) {
                        System.out.println("Digite o nome do aluno" + (i + 1) + ": ");
                        nomeAluno[contadorDeAlunos] = cadastro.nextLine();


                        System.out.println("Digite a primeira nota: ");
                        double nota1 = cadastro.nextDouble();


                        System.out.println("Digite a segunda nota: ");
                        double nota2 = cadastro.nextDouble();
                        cadastro.nextLine();

                        double media = (nota1 + nota2) / 2;
                        mediaAluno[contadorDeAlunos] = media;

                        System.out.println("\n**Aluno cadastrado**");
                        System.out.println("Nome do aluno: " + nomeAluno[contadorDeAlunos]);
                        System.out.println("Primeira nota: " + nota1);
                        System.out.println("Segunda nota: " + nota2);
                        System.out.println("----------------------------");

                        contadorDeAlunos++;
                    } else {
                        System.out.println("Tente novamente");
                        break;
                    }
                }
            } else if (escolha == 2) {
                if (contadorDeAlunos > 0) {
                    System.out.println("*** Lista de alunos cadastrados ***");
                    for (int i = 0; i < contadorDeAlunos; i++) {
                        if (nomeAluno[i] != null && !nomeAluno[i].isEmpty()) {
                            System.out.println((i + 1) + "." + nomeAluno[i]);
                        }
                    }
                } else {
                    System.out.println("Nenhum aluno cadastrado.");
                }

            } else if (escolha == 3) {
                if (contadorDeAlunos > 0) {
                    double somaMedias = 0;
                    double maiorNota = Double.MIN_VALUE;
                    double menorNota = Double.MAX_VALUE;
                    int aprovados = 0, recuperacao = 0, reprovados = 0;

                    for (int i = 0; i < contadorDeAlunos; i++) {
                        double media = mediaAluno[i];
                        somaMedias += media;

                        if (media > maiorNota) {
                            maiorNota = media;
                        }

                        if (media < menorNota) {
                            menorNota = media;
                        }

                        if (media >= 7) {
                            aprovados++;
                        } else if (media >= 5) {
                            recuperacao++;
                        } else {
                            reprovados++;
                        }

                    }

                    double mediaTurma = somaMedias / contadorDeAlunos;

                    System.out.println("*** Estatísticas da Turma ***");
                    System.out.printf("Média da turma: %.2f\n", mediaTurma);
                    System.out.printf("Maior nota registrada: %.2f\n", maiorNota);
                    System.out.printf("Menor nota registrada: %.2f\n", menorNota);
                    System.out.println("-------------------------------");
                    System.out.println("Total de aprovados: " + aprovados);
                    System.out.println("Total em recuperação: " + recuperacao);
                    System.out.println("Total de reprovados: " + reprovados);
                    System.out.println("-------------------------------");
                } else {
                    System.out.println("Nenhum aluno cadastrado para calcular a média.");
                }
            } else if (escolha == 4) {
                if (contadorDeAlunos > 0) {
                    System.out.println("*** Resultados ***");

                    for (int i = 0; i < contadorDeAlunos; i++) {
                        double media = mediaAluno[i];
                        String status;

                        if (media >= 7) {
                            status = "Aprovado";
                        } else if (media >= 5) {
                            status = "Recuperação";
                        } else {
                            status = "Reprovado";
                        }

                        System.out.printf("%s - Média: %.2f - Status: %s\n", nomeAluno[i], media, status);
                        System.out.println("-------------------------");
                    }
                } else {
                    System.out.println("Nenhum aluno cadastrado.");
                }
                
            } else if (escolha == 5) {
                contadorDeAlunos = 0;
                nomeAluno = new String[limiteCadastro];
                mediaAluno = new double[limiteCadastro];

                System.out.println("Nova turma iniciada! Todos os outros dados foram apagados.");
            } else if (escolha == 6) {
                System.out.println("Saindo...");
                cadastro.close();
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        }


    }
