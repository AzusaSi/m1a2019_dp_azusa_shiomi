package Strategy.Atq;

import Strategy.Atq.Attaque;

public class Missile implements Attaque {
    @Override
    public String attaquer() {
        return "attaque en missile";
    }
}
