package banco;
public class Main {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Ana", "548-432-654-23", 27);
        Cliente c2 = new Cliente("Priscilla", "432-654-986-67", 33);
        
        Conta c11 = new ContaCorrente("1243", 246.90, c1);
        Conta c22 = new ContaCorrente("6547", 654.90, c2);
        
        Banco bc = new Banco("Banco bc");

        bc.adicionarConta(c11);
        bc.adicionarConta(c22);

        c11.transferencia(bc, 660.90, bc, c22);
        c11.depositar(10.00);
        c11.transferencia(bc, 660.90, bc, c22);
        c22.imprimirInfo();
    }

}
