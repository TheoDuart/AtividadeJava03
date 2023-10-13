import java.util.Scanner;

public class Atividade09 {
    /*Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
■■ a média das idades das dez pessoas;
■■ a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e
■■ a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de
1,90 m. */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0, qtdPessoas = 0, qtdPessoasEntre30E10 = 0;
        double peso = 0, altura = 0, mediaAltura = 0, porcentgaem = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Informe sua idade: ");
            idade = input.nextInt();
            System.out.println("Informe seu peso: ");
            peso = input.nextDouble();
            System.out.println("Informe sua altura: ");
            altura = input.nextDouble();

            mediaAltura = altura / 10;

            if (peso > 90 && altura < 1.50){
                qtdPessoas++;
            }
            if (idade >= 10 && idade <= 30 && altura < 1.90){
                qtdPessoasEntre30E10++;
                porcentgaem = qtdPessoasEntre30E10 / qtdPessoasEntre30E10;
            }
        }

        System.out.println("A média das idades das dez pessoas: " + mediaAltura);
        System.out.println("A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro: " + qtdPessoas);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de\n" +
                "1,90 m: " + porcentgaem);


        input.close();
    }
}
