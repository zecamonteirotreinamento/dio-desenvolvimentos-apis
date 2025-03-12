package one.digitalinnovation.gof.subsistema2.cep;

import java.io.Serializable;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){

    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "São Paulo";
    }

}
