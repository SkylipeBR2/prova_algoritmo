//Heloisa Mendes do Nascimento Barbosa
//Filipe Angelo de Oliveira
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gasolina = 4.79f;
        float etanol = 3.65f;

        System.out.println("Será qual combustível? \n" +
                "1 - Gasolina \n" +
                "2 - Etanol");
        System.out.println("Digite o código do combustivel escolhido: ");
        byte combu = input.nextByte();

        switch (combu){
            case 1:
                System.out.println("Quantos litros?");
                float litros = input.nextFloat();

                if (litros <= 10){
                    float soma = litros * gasolina;
                    float desconto = soma * 0.05f;
                    soma = soma - desconto;
                    System.out.printf("Valor total: R$%.2f ", soma);
                } else {
                    float soma = litros * gasolina;
                    float desconto = soma * 0.07f;
                    soma = soma - desconto;
                    System.out.printf("Valor total: R$%.2f ", soma);
                }
                break;
            case 2:
                System.out.println("Quantos litros?");
                float litros2 = input.nextFloat();

                if (litros2 <= 5){
                    float soma = litros2 * etanol;
                    System.out.printf("Valor total: R$%.2f ", soma);
                } else {
                    float soma = litros2 * etanol;
                    float desconto = soma * 0.07f;
                    soma = soma - desconto;
                    System.out.printf("Valor total: R$%.2f", soma);
                }
        }
        }

    }

