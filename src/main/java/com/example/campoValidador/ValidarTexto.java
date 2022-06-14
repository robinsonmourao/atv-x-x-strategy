package main.java.com.example.campoValidador;

public class ValidarTexto implements I_ValidadorStrategy{
    
    private int min;
    private int max;

    public ValidarTexto(int min, int max){
        this.min = min;
        this.max = max;
    }
    public ValidarTexto(){
        this.min = -1;
        this.max = -1;
    }
    public Resultado validarCampo(String valor) throws RuntimeException{
        if(valor == null){
            return new Resultado(true, "valor é nulo:");
        }
        if(min == -1 && max == -1){
            return new Resultado();
        }
        Resultado resultado = new Resultado();
        int tamanho = valor.length();

        if(tamanho > max){
            resultado.setErro(true);
        } else if (tamanho < min){
            resultado.setErro(true);        
        }
        
        return resultado;
    }
}
