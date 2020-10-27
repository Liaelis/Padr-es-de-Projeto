package exercicio2ab;

import java.util.Map;

public interface BancoInterface {
    void criarConta(Long numero, Double saldoInicial, Conta.TipoConta tipoConta);

    Conta excluirConta(Long numero);

    Map<Long, Conta> getContas();

    Conta findConta(Long numero);

    void saque(Double valorSaque, Long numero);

    void deposito(Double valorDeposito, Long numero);

    Double verSaldo(Long numeroConta);

    void extrato(Long numero);

    void tranferencia(Long destinatario, Long remetente, Double valor);
}
