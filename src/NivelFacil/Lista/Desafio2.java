package NivelFacil.Lista;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int reposta = 0;
        String[] ninjas = new String[0];
        while (reposta != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            reposta = sc.nextInt();
            int qtdNinjas = 0;

            switch (reposta) {
                case 1:
                    System.out.println("Qual é a qauntiadade de Ninja a ser cadastrado?");
                    qtdNinjas = sc.nextInt();
                    ninjas = new String[qtdNinjas];
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("Qual é o " + (i + 1) + "° Ninja: ");
                        ninjas[i] = sc.next();
                    }
                    break;
                case 2:
                    if (ninjas.length != 0) {
                        for (String ninja : ninjas) {
                            if (ninja != null) {
                                System.out.println("\nNinjas: " + ninja);
                            }
                        }
                    } else {
                        System.out.println("\nNenhum ninja cadastrado!");
                    }
                    break;

                case 3:
                    if (ninjas.length != 0) {

                        int count= 0;
                        for (String ninja : ninjas) {
                            System.out.println("\nNinjas ["+count+"]: " + ninja);
                            count++;
                        }
                        System.out.print("Digite o numero do ninja a ser removido: ");
                        int codigoNinja = sc.nextInt();
                        ninjas[codigoNinja] = null;

                    } else {
                        System.out.println("\nNenhum ninja cadastrado!");
                    }
                    break;
                case 4:
                    System.out.println("Progama Finalizado!");
                    break;

                default:
                    System.out.println("Digitar uma opção valida!");

            }

        }

        sc.close();

    }
}
