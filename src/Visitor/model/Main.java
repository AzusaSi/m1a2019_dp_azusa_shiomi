package Visitor.model;

import Visitor.contrat.IVisitable;

public class Main {
    public static void main(String[] args){
        IVisitable client = new Client("Mickey");
        IVisitable commande = new Commande("Com1");
        IVisitable ligne = new Ligne("lig1");
        ((Commande) commande).addLigne((Ligne) ligne);
        ((Client) client).addCommande((Commande) commande);
        GroupeClient groupeClient = new GroupeClient("Disney");
        groupeClient.addClient((Client) client);
        RapportCommandes rapportCommandes = new RapportCommandes();
        groupeClient.accept(rapportCommandes);
        rapportCommandes.afficherCommandes();
    }
}
