public class Atividade02 {
    public static void main(String[] args) {
        double valoringresso;
        int qtdIngresso = 120;

        for (double valor = 5; valor >= 1; valor = valor - 0.50){
            valoringresso = valor * qtdIngresso - 200;
            System.out.println("Lucro: " + valoringresso + "\nquantidade de ingressos vendidos: " + qtdIngresso + "\nvalor do ingresso: " + valor);
            qtdIngresso = qtdIngresso + 26;
        }
    }
}
