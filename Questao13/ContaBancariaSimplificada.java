public class ContaBancariaSimplificada {
    private String titular;
    private float saldo;

    public ContaBancariaSimplificada(String titular, float saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean deposita(float valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean retira(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public float getSaldo() {
        return saldo;
    }

    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, float valor) {
        if (origem.retira(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
