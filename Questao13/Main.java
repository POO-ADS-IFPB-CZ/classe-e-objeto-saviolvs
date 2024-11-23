public class Main {
    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", 1000f);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", 500f);

        System.out.println("Saldo inicial João: R$ " + conta1.getSaldo());
        System.out.println("Saldo inicial Maria: R$ " + conta2.getSaldo());

        if (ContaBancariaSimplificada.transfere(conta1, conta2, 300f)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência falhou.");
        }

        System.out.println("Saldo final João: R$ " + conta1.getSaldo());
        System.out.println("Saldo final Maria: R$ " + conta2.getSaldo());
    }
}
