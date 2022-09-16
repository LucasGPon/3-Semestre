public class ContaBancaria {
    private double saldo = 1000;

    public void Deposito(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Depósito menor ou igual a zero!!!");
        }
        this.saldo += (valor - (valor * 0.01));
    }

    public void Saque(double valor) throws Exception {
        if (valor > saldo) {
            if (valor <= 0) {
                throw new Exception("Saque menor ou igual a zero!!!");
            }
            throw new Exception("Saque maior que o saldo!!!");
        }
        this.saldo -= (valor + (valor * 0.005));
    }

    public double Consulta() {
        return saldo;
    }
}
