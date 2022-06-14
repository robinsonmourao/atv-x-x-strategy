package main.java.com.example.campoValidador;

public class Campo {

    private String id;
	private String nome;
	private boolean isObrigatorio;
    private String valor;

	private I_ValidadorStrategy validadorStrategy;

	public Campo(String ID){
		this.id = ID;
	}
	public Campo(I_ValidadorStrategy strategy, String ID){
		this.validadorStrategy = strategy;
		this.id = ID;
	}
	public Campo(String ID, boolean isObrigatorio){
		this.id = ID;
		this.isObrigatorio = isObrigatorio;
	}
	public Campo(String ID, String nome){
		this.id = ID;
		this.nome = nome;
	}
	public Campo(String ID, boolean isObrigatorio, String nome){
		this.id = ID;
		this.isObrigatorio = isObrigatorio;
		this.nome = nome;
	}

	public String getID() {
		return this.id;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public boolean isPreechido(){
		if(this.nome == null || this.id == null || this.valor == null){
			return true;
		} else{
			return false;
		}
	}
	public boolean getIsObrigatorio(){
		return this.isObrigatorio;
	}
	public void setIsObrigatorio(boolean isObrigatorio){
		this.isObrigatorio = isObrigatorio;
	}
    public Resultado validar(){
        Resultado resultado = new Resultado();
		if(this.isObrigatorio && !this.isPreechido()){
			resultado.setErro(true);
			resultado.addMensagem("Este campo é obrigatório!");
			return resultado;
		}
		return this.validadorStrategy.validarCampo(this.valor);
    }
	public void setValidador(Resultado resultado){

	}
    
}
