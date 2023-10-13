import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, primo = 0, qtdPrimos = 0;

        for (int i = 0; i < 10; i++){

            System.out.println("Informe um número: ");
            num = input.nextInt();

            if (num % 2 == 0){
                primo++;
                qtdPrimos =+ primo;
            }
        }
        System.out.println("A quantidade de números primos dentre os valores que você digitou anteriormente é: " + qtdPrimos);

    }
}
