package banco;
public class ContaCorrente extends Conta {
    
    public ContaCorrente(String agencia, double saldo, Cliente dono) {
        super(agencia, saldo, dono);
    }

    @Override
    public boolean sacar(double saque) {
        if(this.saldo > saque) {
            this.saldo -= saque * 1.1; //taxa ao sacar em contas correntes
            System.out.println("Operação feita com sucesso");
            return true;
        }
    
        System.out.println("Saldo insuficiente para operação");
        return  false; 
    }

    @Override
    public void imprimirInfo() {
        System.out.println("===Informações da Conta Corrente===");
        System.out.println(this);
    }
}
