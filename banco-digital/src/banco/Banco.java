package banco;
import java.util.HashSet;
import java.util.Set;

public class Banco {
    
    private String nome;
    private Set<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void setContas(Set<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta novo) {
        contas.add(novo);
    }

    public void removerConta(Conta aRemover) {
        contas.remove(aRemover);
    }
}
