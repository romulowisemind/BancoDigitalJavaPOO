public class Main {
    public static void main(String[] args) {

        QualBanco dio = new QualBanco();
        dio.setNomeDoBanco("Digital Innovation One");

        Cliente romulo = new Cliente();
        romulo.setNome("Romulo Costa Segato");

        IConta cc = new ContaCorrente(romulo, dio);
        IConta poupanca = new ContaPoupanca(romulo, dio);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}