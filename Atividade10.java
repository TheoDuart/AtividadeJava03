import java.util.Scanner;

public class Atividade10 {
    /*Faça um programa que receba dez números, calcule e mostre a soma dos números pares e a soma dos
números primos.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, somaPar = 0, somaPrimo = 0, primo = 0;

        for (int i = 0; i < 10; i++){

            System.out.println("Informe o " + (i+1) +"° número: ");
            num = input.nextInt();

            if (num % 2 == 0){
                somaPar += num;
            }
        }

        for (int j = 2; j <= num; j++){
            if (num % j == 0){
                primo++;
            }
        }
        if (primo == 1){
            somaPrimo += num;
        }

        System.out.println("Soma Pares: " + somaPar);
        System.out.println("Soma Primos: " + somaPrimo);
        input.close();
    }
}
