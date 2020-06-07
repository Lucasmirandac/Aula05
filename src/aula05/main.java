/*
 Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. O Jubileu optou por abrir uma conta poupança, e irá deposita 300 reais na sua conta.
A Creusa, possui mais dinheiro e quer depositar 500 reais em uma conta corrente. Para isso, eles precisam abrir uma conta no banco.


Requisitos: 

1. O tipo da conta só aceita dois caracteres, cc e cp. Conta corrente e conta poupança, respectivamente.
2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro. É nesse momento que decido qual conta vou abrir, e caso seja uma cp já recebe um presente de 150 reais, ou caso escolha abrir uma conta corrente, seu presente é de 50 reais.
3. Para fechar conta, o Jubileu ou a Creusa não vão poder ter dinheiro dentro da sua conta.
4. Para fazer um depósito ou sacar, a conta já deve ter sido aberta com status verdadeiro. No caso do saque, eu devo já ter dinheiro dentro, e o valor do saque não deve ser superior ao seu saldo.
5. A mensalidade vai ser cobrada diretamente do saldo. Na hora que for chamado a mensalidade, o cliente com cc pagará 12 reais, e o cliente com cp pagará 20 reias de mensalidade.
6. Você precisará usar o método getter e setter para TODOS os atributos.
7.  É necessário ter um método construtor, onde o seu status será definido como zero e o saldo definido como zero, pois a conta está fechada.
 */
package aula05;

/**
 *
 * @author lucas.miranda
 */
public class main {

    public static void main(String[] args) {
              
        Conta c1 = new Conta();
        c1.setDono("Jubileu");
        c1.setTipoConta("CP");
        c1.abrirConta(c1.getDono(), c1.getTipoConta());   
        c1.depositar(300f);

        Conta c2 = new Conta();
        c2.setDono("Creuza");
        c2.setTipoConta("CC");
        c2.abrirConta(c2.getDono(), c2.getTipoConta());
        c2.depositar(500f);
        
        c1.estadoAtual();
        System.out.println("------------------------\n");
        c2.estadoAtual();
        c2.fecharConta();
    }
    
}
