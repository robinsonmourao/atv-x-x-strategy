package main.java.com.example.campoValidador;

//OBJETIVO DO STRATEGY:
//D1 = ISOLAR DIFERENTES IMPLEMENTAÇÕES DE UM DETERMINADO ALGORITMO ATRAVÉS DE UMA INTERFACE

public interface I_ValidadorStrategy {
    
    public Resultado validarCampo(String valor);
}
