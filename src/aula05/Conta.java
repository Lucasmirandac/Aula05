
package aula05;

/**
 *
 * @author lucas.miranda
 */
import java.util.Random;

public class Conta {
    //atributos
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;
    
//metodos especiais
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
 
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //Metodos Personalizados
    public void abrirConta(String dono, String tipoConta ){
        setDono(dono);
        setTipoConta(tipoConta);
        Random rand = new Random(); //instance of random class       
        double double_random=rand.nextDouble()*100000;
        int numConta = (int) double_random;
        setNumConta(numConta);
        setStatus(true);
        
        if (tipoConta == "CC")
            this.saldo = 50f;
        else if (tipoConta == "CP")
            this.saldo = 150f;
        
        
    }
    
    public void fecharConta(){
        if (isStatus() == false){
            System.out.print("Esta conta já está fechada");
            
        }
        if (saldo < 0){
            System.out.println("Não é possível fechar uma conta com saldo negativo");
        }
        else if(this.saldo > 0){
            sacar(this.saldo);
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }  
    }
    
    float sacar(float valor){
        
        if (isStatus() == false)
            System.out.print("Não é possível sacar de conta inativa");
        else
            setSaldo(getSaldo()-valor);
            return getSaldo();
                
    }
    
    float depositar(float valor){
        if (isStatus() == false)
            System.out.print("Não é possível depositar de conta inativa");
        else
            setSaldo(getSaldo()+valor);
            return getSaldo();
                
    }
    
    void pagarMensal(String tipoConta){
        if (tipoConta == "CC")
            setSaldo(getSaldo()+12);

        else if (tipoConta == "CP")
            setSaldo(getSaldo()+20);
                    
    }
    
    void estadoAtual(){
        System.out.print(getNumConta() + "\n");
        System.out.print(getTipoConta() + "\n");
        System.out.print(getDono() + "\n");
        System.out.print(getSaldo() + "\n");
        System.out.print(isStatus() + "\n");
        
    }
    
}
