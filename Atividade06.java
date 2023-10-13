import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codigo;
        double totalAVista = 0, totalAPrazo = 0, valorCompra, total;

        for (int i = 0; i <= 15; i++){
            System.out.println("Informe o código: ");
            codigo = input.next().toUpperCase();
            System.out.println("Informe o valor da compra: ");
            valorCompra = input.nextDouble();

        if (codigo.equals("V")){
            totalAVista = totalAVista + valorCompra;
        }else if(codigo.equals("P")){
            totalAPrazo = totalAPrazo + valorCompra;
        }else {
            System.out.println("Código inválido!");
        }
        }
        total = totalAPrazo + totalAVista;

        System.out.println("O valor total das compras à vista: " + totalAVista);
        System.out.println("O valor total das compras á prazo: " + totalAPrazo);
        System.out.println("O valor das compras efetuadas: " + total);
        System.out.println("O valor das compras efetuadas: " + totalAPrazo/3);
        input.close();
    }
}
