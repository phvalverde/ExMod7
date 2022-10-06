public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Professor, aqui está as informações solicitadas");

        Cliente cliente = new Cliente();

            //Cadastrando informações recebidas
        cliente.cadastrarEndereco("Dagobah");
        cliente.cadastrarNome("Anakin Skywalker");
        cliente.setCodigo(666);

            //Imprimindo dados
        System.out.println(cliente.getCodigo());
        cliente.imprimirNome();
        cliente.imprimirEndereco();
        System.out.println(cliente.getValorTotal());

        /*
          Exercício do módulo 7

          @author Paulo.Valverde
         */
    }
}