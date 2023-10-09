//Heloisa Mendes do Nascimento Barbosa
//Filipe Angelo De Oliveira

import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float renda1 = 1903.98f;
        float renda2 = 2826.65f;
        float renda3 = 3751.05f;
        float renda4 = 4664.68f;
        byte teste;


        do {
        System.out.println("Digite o seu salário bruto: ");
        float salario = input.nextFloat();

        if (salario < renda1){
            System.out.println("Isento de Alíquota");
            System.out.println("O salário bruto do contribuinte: " + salario);

        } else if (salario > renda1 && salario <= renda2){
            float imposto = salario * 0.075f;
            float desconto = salario - imposto;
            System.out.println("O salário bruto do contribuinte: " + salario);
            System.out.println("O salário líquido do contribuinte: " + desconto);
            System.out.println("A alíquota do contribuinte: " + imposto);
        }

        else if (salario > renda2 && salario <= renda3){
            float imposto = salario * 0.15f;
            float desconto = salario - imposto;
            System.out.println("O salário bruto do contribuinte: " + salario);
            System.out.println("O salário líquido do contribuinte: " + desconto);
            System.out.println("A alíquota do contribuinte: " + imposto);
        }

        else if (salario > renda3 && salario <= renda4){
            float imposto = salario * 0.225f;
            float desconto = salario - imposto;
            System.out.println("O salário bruto do contribuinte: " + salario);
            System.out.println("O salário líquido do contribuinte: " + desconto);
            System.out.println("A alíquota do contribuinte: " + imposto);
        }

        else if (salario > renda4 ){
            float imposto = salario * 0.275f;
            float desconto = salario - imposto;
            System.out.println("O salário bruto do contribuinte: " + salario);
            System.out.println("O salário líquido do contribuinte: " + desconto);
            System.out.println("A alíquota do contribuinte: " + imposto);
        }
            System.out.println("\n Deseja recomeçar? \n" +
                    "0 - Não \n" +
                    "1 - Sim");
            teste = input.nextByte();
        } while(teste != 0);
    }
}
