package Strategy.Dep;

import Strategy.Dep.Deplacement;

public class Rouler implements Deplacement {
    @Override
    public String deplacer() {
        return "deplacer en roulant";
    }
}
