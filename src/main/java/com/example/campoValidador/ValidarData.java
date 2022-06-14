package main.java.com.example.campoValidador;

public class ValidarData implements I_ValidadorStrategy{
/* 
    private String data;
    private boolean isDataValida;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
*/
    public Resultado validarCampo(String data) throws RuntimeException{
        Resultado resultado = new Resultado(true, data);
        return resultado;
    }
}
