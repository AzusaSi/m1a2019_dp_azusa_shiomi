package Strategy.Atq;

import Strategy.Atq.Attaque;

public class Canon implements Attaque {
    @Override
    public String attaquer() {
        return "attaque en canon";
    }
}
