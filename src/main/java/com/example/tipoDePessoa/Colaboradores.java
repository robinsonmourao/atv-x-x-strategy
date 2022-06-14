package main.java.com.example.tipoDePessoa;

public class Colaboradores {
    
    private String nomePessoa;
    private String identificador;
    private TipoPessoaStrategy pessoa;
    
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public TipoPessoaStrategy getPessoa() {
		return pessoa;
	}
	public void setPessoa(TipoPessoaStrategy pessoa) {
		this.pessoa = pessoa;
	}
    
}
