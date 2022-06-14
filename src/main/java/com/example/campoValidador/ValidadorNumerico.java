package main.java.com.example.campoValidador;

public class ValidadorNumerico implements I_ValidadorStrategy{

    /*private String numero;
    private boolean isNumeroValida;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
*/
    public Resultado validarCampo(String numero) throws RuntimeException{
        Resultado resultado = new Resultado(true, numero);
        return resultado;
    }
}
