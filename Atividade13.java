import java.util.Scanner;

public class Atividade13 {
    /*Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos
pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a
30 anos e de 31 anos para cima.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        double peso, fx1E10 = 0, fx11E20 = 0, fx21E30 = 0, fx31 = 0, totalPesos = 0;
        double mediaPesos1 = 0, mediaPesos2 = 0, mediaPesos3 = 0, mediaPesos4 = 0;

        for (int i = 1; i <= 15; i++){
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            System.out.println("Digite seu peso: ");
            peso = input.nextDouble();

            if(idade >= 1 && idade <= 1){
                fx1E10++;
                totalPesos += peso;
                mediaPesos1 = totalPesos / fx1E10;
            }
            if(idade >= 11 && idade <= 20){
                fx11E20++;
                totalPesos += peso;
                mediaPesos2 = totalPesos / fx11E20;
            }
            if(idade >= 21 && idade <= 30) {
                fx21E30++;
                totalPesos += peso;
                mediaPesos3 = totalPesos / fx21E30;
            }
            if(idade > 31){
                fx31++;
                totalPesos += peso;
                mediaPesos4 = totalPesos / fx31;
            }
        }
        System.out.println("A média de pesos da mesma faxetária é: " + mediaPesos1);
        System.out.println("A média de pesos da mesma faxetária é: " + mediaPesos2);
        System.out.println("A média de pesos da mesma faxetária é: " + mediaPesos3);
        System.out.println("A média de pesos da mesma faxetária é: " + mediaPesos4);
    }
}
