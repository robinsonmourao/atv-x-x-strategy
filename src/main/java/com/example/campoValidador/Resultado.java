package main.java.com.example.campoValidador;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    
    private String valor;
    private boolean erro;
    private List<String> mensagens = new ArrayList<>();

    public Resultado(){
        
    }

    public Resultado(boolean erro, String valor){
        this.valor = valor;
        this.erro = erro;        
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean getErro() {
        return erro;
    }
    public void setErro(boolean erro) {
        this.erro = erro;
    }
    public void addMensagem(String novaMensagem){
        mensagens.add(novaMensagem);
    }
    
}
