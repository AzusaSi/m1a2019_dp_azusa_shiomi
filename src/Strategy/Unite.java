package Strategy;

import Strategy.Atq.Attaque;
import Strategy.Dep.Deplacement;

public class Unite {
    private Attaque atq;
    private Deplacement dep;

    public Unite(Attaque atq,Deplacement dep){
        setUnite(atq,dep);
    }

    public void setUnite(Attaque atq,Deplacement dep){
        this.atq = atq;
        this.dep = dep;;
    }

    public String seDeplacer(){
        return dep.deplacer();
    }

    public String combattre(){
        return atq.attaquer();
    }
}
