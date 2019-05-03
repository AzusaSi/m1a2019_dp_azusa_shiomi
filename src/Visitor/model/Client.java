package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable {
    private String name;
    private List<Commande> commandes = new ArrayList<>();

    public void accept(IVisitor visitor){

    }

    public String getName(){
        return this.name;
    }

    public void addCommande(Commande commande){
        this.commandes.add(commande);
    }

    public Client(String name){
        this.name = name;
    }
}
