public class ContaCorrente {
    private String Nome;
    private float Saldo;
    private int NumeroConta;

    public ContaCorrente(String Nome,float Saldo,int NumeroConta){
        this.Nome = Nome;
        this.Saldo = Saldo;
        this.NumeroConta = NumeroConta;
    }

    public void transferirDinheiro(float ValorDaTransferencia,ContaCorrente PessoaReceptor){
        if(Saldo >= ValorDaTransferencia){
            PessoaReceptor.Saldo = PessoaReceptor.Saldo + ValorDaTransferencia;
            System.out.printf("Transferencia realizada com sucesso para %s \n ",PessoaReceptor.getNome());
            this.Saldo = Saldo - ValorDaTransferencia;
        }
        else if (Saldo < ValorDaTransferencia){
            System.out.printf("Saldo insuficiente");
        }
    }
    public void consultarSaldo(int NumeroConta){
        if(NumeroConta == this.NumeroConta){
            System.out.printf("Saldo: %s \n",this.Saldo);
        }
        else{
            System.out.print("Numero de conta errado \n");
        }
    }
    public void depositarDinheiro(float ValorDeposito){
        this.Saldo = this.Saldo + ValorDeposito;
        System.out.print("Deposito feito com êxito \n");
    }
    public void sacarDinheiro(float ValorSaque){
        if(this.Saldo < ValorSaque){
            System.out.print("Saldo insuficiente \n");
        }
        else {
            System.out.printf("Sacando o valor de %s \n ",ValorSaque);
            this.Saldo = this.Saldo - ValorSaque;
        }
    }
    public void excluirConta(boolean excluir){
        if (excluir && this.Saldo == 0){
            this.Nome = null;
            this.NumeroConta = 0;
            System.out.print("Conta exclúida \n");
        }
        else if(excluir && this.Saldo > 0){
            System.out.print("Saque o dinheiro antes de excluir a conta \n");
        }
    }
    public float getSaldo(){
        return this.Saldo;
    }
    public void setSaldo(float Saldo){
        this.Saldo = Saldo;
    }
    public String getNome(){
        return this.Nome;
    }
    public int getNumeroConta(){
        return this.NumeroConta;
    }
}

