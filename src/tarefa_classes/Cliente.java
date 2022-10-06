package tarefa_classes;

public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }
    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public void cadastrarNome(String nome) {
        setNome(nome);
    }
    public void imprimirNome() {
        System.out.println(this.nome);
    }

    /**
     * @return Referente ao valor total gasto
     */
    public int getValorTotal() {
        return 20;
    }
}
