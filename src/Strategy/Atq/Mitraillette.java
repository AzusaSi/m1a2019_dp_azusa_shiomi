package Strategy.Atq;

import Strategy.Atq.Attaque;

public class Mitraillette implements Attaque {
    @Override
    public String attaquer() {
        return "attaque en miraillette";
    }
}
