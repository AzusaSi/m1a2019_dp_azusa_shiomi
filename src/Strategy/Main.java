package Strategy;

import Strategy.Atq.Canon;
import Strategy.Atq.LanceFlamme;
import Strategy.Atq.Missile;
import Strategy.Atq.Mitraillette;
import Strategy.Dep.Courir;
import Strategy.Dep.Rouler;
import Strategy.Dep.Voler;

public class Main {
    public static void main(String[] args){
        Unite unite = new Unite(new Canon(),new Courir());
        System.out.println(unite.seDeplacer());
        System.out.println(unite.combattre());
        unite.setUnite(new LanceFlamme(),new Rouler());
        System.out.println(unite.seDeplacer());
        System.out.println(unite.combattre());
        unite.setUnite(new Missile(),new Voler());
        System.out.println(unite.seDeplacer());
        System.out.println(unite.combattre());
    }
}
