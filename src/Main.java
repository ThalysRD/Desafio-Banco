public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente thalys = new Cliente("Thalys");

        Conta cc = new ContaCorrente(thalys);
        Conta cp = new ContaPoupanca(thalys);
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        cc.depositar(100);
        cc.transferir(100, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.exibirTodosOsClientes();
    }
}
