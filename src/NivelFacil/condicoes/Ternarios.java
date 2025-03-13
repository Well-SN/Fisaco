package NivelFacil.condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        // Usando operador ternário para verificar a maioridade
        // String resultado = (Condição)? true : false;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado: " + resultado);
        scanner.close();


    }
}
