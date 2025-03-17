package banco;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, double saldo, Cliente dono) {
        super(agencia, saldo, dono);
    }

    @Override
    public void imprimirInfo() {
        System.out.println("===Informações da Conta Poupança===");
        System.out.println(this);
    }
}
