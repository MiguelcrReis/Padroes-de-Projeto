package one.digitalinnovation.gof.singleton;


/**
 * Singleton "apressado"
 *
 * @author miguel.reis
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
