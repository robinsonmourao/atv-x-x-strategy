package main.java.com.example.tipoDePessoa;

public class PessoaJuridica implements TipoPessoaStrategy {

    private String nomeFantasia;
    private String CNPJ;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String novoNomeFantasia) {
        this.nomeFantasia = novoNomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String novoCNPJ) {
        CNPJ = novoCNPJ;
    }

    @Override
    public void tipoPessoa(String pessoa) {

    }

}
