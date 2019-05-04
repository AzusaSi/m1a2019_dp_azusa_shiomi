package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

import java.util.List;
import java.util.ArrayList;

public class Commande implements IVisitable{
    private String name;
    private List<Ligne> lignes = new ArrayList<Ligne>();

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public String getName(){
        return this.name = name;
    }

    public void addLigne(Ligne ligne){
        this.lignes.add(ligne);
    }

    public Commande(String name){
        this.name = name;
        this.lignes =new ArrayList<Ligne>();
    }

    public Commande(String name, String ligneName){
        this.name =name;
        this.addLigne(new Ligne(ligneName));
    }

    public String toString(){
        return "Commande{"+"name='"+name+'\''+'}';
    }
}
