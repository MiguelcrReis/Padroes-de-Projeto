package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    public CepAPI() {
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Atibaia";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}

