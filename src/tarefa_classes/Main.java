package tarefa_classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Professor, aqui está as informações solicitadas");

        Cliente cliente = new Cliente();

            //Cadastrando informações recebidas
        cliente.cadastrarEndereco("Dagobah");
        cliente.cadastrarNome("Anakin Skywalker");
        cliente.setCodigo(666);

            //Pretendia criar dois clientes diferentes, mas ainda não entendi como fazer isso
//        cliente.cadastrarEndereco("Estrela da Morte");
//        cliente.cadastrarNome("Palpatine");
//        cliente.setCodigo(333);

            //Imprimindo dados
        System.out.println(cliente.getCodigo());
            //usei a mesma fórmula do endereço pra imprimir um nome ao cliente
        cliente.imprimirNome();
        cliente.imprimirEndereco();
        System.out.println(cliente.getValorTotal());

        // Exercício do módulo 7
        //
        // @author Paulo.Valverde
    }
}