public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(12345);
        conta.setSaldo(500.00);
        conta.titular = "João Silva";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
    }
}

