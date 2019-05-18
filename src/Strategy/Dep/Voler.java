package Strategy.Dep;

import Strategy.Dep.Deplacement;

public class Voler implements Deplacement {
    @Override
    public String deplacer() {
        return "deplacer en volant";
    }
}
