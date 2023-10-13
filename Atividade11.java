import java.util.Scanner;

public class Atividade11 {
/*Faça um programa que receba o valor de um carro e mostre uma tabela com os seguintes dados: preço
final, quantidade de parcelas e valor da parcela. Considere o seguinte:
■■ o preço final para compra à vista tem desconto de 20%;
■■ a quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60; e
■■ os percentuais de acréscimo encontram-se na tabela a seguir.

QuanTidade de parcelas percenTual de acréscimo sobre o preço final
6 3%
12 6%
18 9%
24 12%
30 15%
36 18%
42 21%
48 24%
54 27%
60 30%*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorCarro, precoFinal, quantidadesParcelas, valorParcela, juros;

        System.out.print("Informe o valor do carro: ");
        valorCarro = input.nextDouble();

        for (int i = 6; i <= 60; i = i + 6){
            juros = i/2;
            valorParcela = (valorCarro / i) + (juros/100);
            precoFinal = valorCarro + (valorCarro * juros/100);
            System.out.println(
                    "Parcelas: "+i+"| Acréscimo: "+juros
                            +"% | Valor da parcela: R$"
                            +valorParcela+"| Preço final: R$"+precoFinal
            );
        }
        input.close();
}
}