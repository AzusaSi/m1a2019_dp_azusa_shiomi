package Visitor.model;

import Visitor.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class RapportCommandes implements IVisitor {
    private List<Commande> commandeList = new ArrayList<Commande>();

    public void visit(Client client){
        System.out.println("Client visite : "+client.toString());
    }

    public void visit(Commande commande){
        System.out.println("Commande visite : "+commande.toString());
    }

    public void visit(Ligne ligne){
        System.out.println("Ligne visite : "+ligne.toString());
    }

    public void afficherCommandes(){
        commandeList.forEach(System.out::println);
    }
}
