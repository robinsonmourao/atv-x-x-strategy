package main.java.com.example.campoValidador;

import java.util.HashMap;
import java.util.Map;

public class Formulario {
    
    private Map<String, Campo> campos = new HashMap<>();
    private boolean isValidado;

    public void addCampo(Campo novoCampo){
        campos.put(novoCampo.getID(), novoCampo);
    }
    public boolean validar(){
        isValidado = true;
        return isValidado;
    }
    public void setValor(String idCampo, String valor) throws RuntimeException{
        if(campos.containsKey(idCampo)){
            Campo campo = new Campo(idCampo, valor);
            campos.put(idCampo, campo);
        
        }else{
            throw new RuntimeException("Campo não encontrado!");
        }
    }
}
