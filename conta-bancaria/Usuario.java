public class Usuario {

    public static void main(String[] args) throws Exception {

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Qual sua conta?" + contaTerminal.numero);
        System.out.println("Qual sua agencia?" + contaTerminal.agencia);
        System.out.println("Confirma seu nmme?"+contaTerminal.nomeCliente);
        System.out.println("Seu saldo : " + contaTerminal.saldo);
        
    }
    
}
