public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, QualBanco qualBanco) {
        super(cliente, qualBanco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato conta corrente! ------");
        imprimirInfosComuns();
    }
}
