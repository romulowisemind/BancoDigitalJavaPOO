public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, QualBanco qualBanco) {
        super(cliente, qualBanco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato conta poupança! ------");
        imprimirInfosComuns();
    }

}
