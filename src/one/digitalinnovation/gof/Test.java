package one.digitalinnovation.gof;


import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args){

        //Singleton
        //Teste relacionados ao Design Pattern Singleton:
/*
        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder =  SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
*/
        //Strategy
        /*
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        */
        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Miguel", "12948-168");

    }
}
