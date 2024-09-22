import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Conta> contas;

    public Banco (){

        this.contas = new HashSet<>();
    }

    public void adicionarConta (Conta conta) {
        this.contas.add(conta);
    }

    public Set<Conta> getContas(){
        return  contas;
    }

    public void exibirTodosOsClientes(){
        System.out.println(contas);
    }


}
