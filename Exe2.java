//Heloisa Mendes do Nascimento Barbosa
//Filipe Angelo De Oliveira

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int maior = 0, menor = 0;

        do {
            System.out.println("Digite um valor inteiro: ");
            n = input.nextInt();

            if (n >= maior) {
                 maior = n;
            }
            if (n < maior && n > 0) {
                menor = n;
            }

        } while (n >= 0);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
