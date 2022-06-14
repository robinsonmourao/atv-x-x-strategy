package main.java.com.example.tipoDePessoa;


public class PessoaFisica implements TipoPessoaStrategy {

    private String nome;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String novoCPF) {
        CPF = novoCPF;
    }

    @Override
    public void tipoPessoa(String pessoa) {

    }

}
