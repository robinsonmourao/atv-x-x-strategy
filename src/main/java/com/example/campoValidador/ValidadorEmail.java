package main.java.com.example.campoValidador;

public class ValidadorEmail implements I_ValidadorStrategy{
    
    //private String email;

   /* 
   private boolean isEmailValido;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
*/
    public Resultado validarCampo(String email) throws RuntimeException{
		Resultado resultado = new Resultado(true, email);
        return resultado;
    }
}
