package one.digitalinnovatione.gof.strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();

    }
}
