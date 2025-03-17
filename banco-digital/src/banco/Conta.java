package banco;
public abstract class Conta {
    protected String agencia;
    protected double saldo;
    protected Cliente dono;
    
    public Conta(String agencia, double saldo, Cliente dono) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.dono = dono;
    }

    protected String getAgencia() {
        return agencia;
    }

    protected void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    protected Cliente getDono() {
        return dono;
    }
    
    protected void setDono(Cliente dono) {
        this.dono = dono;
    }

    public boolean sacar(double saque) {
        if(this.saldo > saque) {
        this.saldo -= saque;
        System.out.println("Operação feita com sucesso");
        return true;
        }

        System.out.println("Saldo insuficiente para operação");
        return  false;
    }

    public void depositar(double deposito) {
        System.out.println("Operação feita com sucesso");
        this.saldo += deposito;
    }

    public void transferencia(Banco bancoRemetente, double valor, Banco bancoDestinatario, Conta contaDestinatario) {
        if (contaDestinatario == null || bancoDestinatario == null || bancoDestinatario != bancoRemetente) {
            System.out.println("Banco / Cliente inválido");
            return;
        }

        System.out.println("Transferência feita com sucesso");
        this.sacar(valor);
        contaDestinatario.depositar(valor);
    }

    public abstract void imprimirInfo();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta{");
        sb.append("agencia=").append(agencia);
        sb.append(", saldo=").append(String.format("%.2f", saldo));
        sb.append(", dono=").append(dono);
        sb.append('}');
        return sb.toString();
    }
}
