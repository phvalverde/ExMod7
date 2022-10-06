public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Paulo");
        Cliente cliente = new Cliente();
            //Cadastro das informações
        cliente.cadastrarEndereco("Rua Monte Alegre, 15");
        cliente.cadastrarNome("Leila Valverde");
        cliente.setCodigo(13);
            //Imprimir as informações
        System.out.println(cliente.getCodigo());
        cliente.imprimirNome();
        cliente.imprimirEndereco();
        System.out.println(cliente.getValorTotal());

    }
}