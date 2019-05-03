package Visitor.contrat;

import Visitor.model.Client;
import Visitor.model.Commande;
import Visitor.model.Ligne;

public interface IVisitor {
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
    void afficherCommandes();
}
