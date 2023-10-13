import java.util.Scanner;

public class Atividade14 {
    /*Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua opinião
    em relação ao filme: ótimo — 3; bom — 2; regular — 1. Faça um programa que receba a idade e a opinião de quinze espectadores,
    calcule e mostre:
    ■■ a média das idades das pessoas que responderam ótimo;
    ■■ a quantidade de pessoas que responderam regular; e
    ■■ a percentagem de pessoas que responderam bom, entre todos os espectadores analisados*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, totalIdadeOtimo = 0, qtdOtimo = 0, qtdRegular = 0, qtdBom = 0, opiniao;
        double media, idadeOtimo, porcentagem;

        for (int i = 0; i < 15; i++){
            System.out.println("Digite sua idade" + i + ": ");
            idade = input.nextInt();

            System.out.println("A sua opinião em relação ao filme" + i + "(ótimo — 3; bom — 2; regular — 1):");
            opiniao = input.nextInt();

            if (opiniao == 1){
                qtdRegular++;
            }else if (opiniao == 2){
                qtdBom++;
            }else if (opiniao == 3){
                qtdOtimo++;
                totalIdadeOtimo += idade;
            }
        }
        media = totalIdadeOtimo/qtdOtimo;
        porcentagem = qtdBom * (15 / 100);

        System.out.println("A média das idades das pessoas que responderam ótimo: " + media);
        System.out.println("A quantidade de pessoas que responderam regular: " + qtdRegular);
        System.out.println("A percentagem de pessoas que responderam bom: " + porcentagem + "%");
        input.close();
    }
}
