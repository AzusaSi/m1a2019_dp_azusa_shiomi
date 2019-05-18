package Strategy.Atq;

import Strategy.Atq.Attaque;

public class LanceFlamme implements Attaque {
    @Override
    public String attaquer() {
        return "attaque en lance flamme";
    }
}
